package com.lab.backend.lattes.services;

import com.lab.backend.lattes.dtos.*;
import com.lab.backend.lattes.entities.Docente;
import com.lab.backend.lattes.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class LattesService {

    @Autowired
    private DocenteRepository docenteRepository;
    @Autowired
    private ProducaoRepository producaoRepository;
    @Autowired
    private OrientacaoRepository orientacaoRepository;
    @Autowired
    private PremioRepository premioRepository;
    @Autowired
    private RegistroPatenteRepository patenteRepository;


    public Map<String, PesquisaDto> buscarPorIds(Collection<String> idsLattes) {

        Map<String, Integer> mapIdLattesToDoc =
                docenteRepository.findByIdLattesIn(idsLattes).stream()
                        .collect(Collectors.toMap(Docente::getIdLattes, Docente::getId));

        if (mapIdLattesToDoc.isEmpty()) return Collections.emptyMap();
        Collection<Integer> idsDoc = mapIdLattesToDoc.values();

        var producoes = producaoRepository.findAllByDocentes(idsDoc);
        var orientacoes = orientacaoRepository.findAllByDocentes(idsDoc);
        var premios = premioRepository.findAllByDocentes(idsDoc);
        var patentes = patenteRepository.findAllByDocentes(idsDoc);

        Map<String, PesquisaDto> resposta = new HashMap<>();
        idsLattes.forEach(id -> resposta.put(id, new PesquisaDto()));

        producoes.forEach(p -> {
            p.getDocentes().forEach(d -> {
                PesquisaDto dto = resposta.get(d.getIdLattes());
                if (dto != null) {
                    dto.getProducoes().add(new ProducaoDto(p));
                }
            });
        });

        orientacoes.forEach(o ->
                resposta.get(o.getDocente().getIdLattes())
                        .getOrientacoes().add(new OrientacaoDto(o))
        );

        premios.forEach(pr ->
                resposta.get(pr.getDocente().getIdLattes())
                        .getPremios().add(new PremioDto(pr))
        );

        patentes.forEach(pa ->
                resposta.get(pa.getDocente().getIdLattes())
                        .getPatentes().add(new PatenteDto(pa))
        );

        return resposta;
    }

}

