package com.lab.backend.lattes.repositories;

import com.lab.backend.lattes.entities.Producao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface ProducaoRepository extends JpaRepository<Producao, Integer> {
    @Query("""
        select distinct p
        from Producao p
        join fetch p.docentes d
        where d.id in :idsDocentes
    """)
    List<Producao> findAllByDocentes(Collection<Integer> idsDocentes);
}
