package com.lab.backend.lattes.dtos;

import java.util.ArrayList;
import java.util.List;
public class PesquisaDto {

    private final List<ProducaoDto> producoes = new ArrayList<>();
    private final List<OrientacaoDto> orientacoes = new ArrayList<>();
    private final List<PremioDto> premios = new ArrayList<>();
    private final List<PatenteDto> patentes = new ArrayList<>();

    public PesquisaDto() {
    }

    public List<ProducaoDto> getProducoes(){ return producoes;}
    public List<OrientacaoDto> getOrientacoes() { return orientacoes;}
    public List<PremioDto> getPremios() { return premios;}
    public List<PatenteDto> getPatentes(){ return patentes;}
}

