package com.lab.backend.lattes.repositories;

import com.lab.backend.lattes.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {
    Optional<Docente> findByIdLattes(String idLattes);

    List<Docente> findByIdLattesIn(Collection<String> idsLattes);
}
