package com.lab.backend.lattes.repositories;

import com.lab.backend.lattes.entities.Premio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface PremioRepository extends JpaRepository<Premio, Integer> {
    @Query("select p from Premio p where p.docente.id in :ids")
    List<Premio> findAllByDocentes(Collection<Integer> ids);
}
