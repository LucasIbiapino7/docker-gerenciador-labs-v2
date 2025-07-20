package com.lab.backend.lattes.repositories;

import com.lab.backend.lattes.entities.Orientacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface OrientacaoRepository extends JpaRepository<Orientacao, Integer> {
    @Query("select o from Orientacao o where o.docente.id in :ids")
    List<Orientacao> findAllByDocentes(Collection<Integer> ids);
}
