package com.lab.backend.lattes.repositories;

import com.lab.backend.lattes.entities.RegistroPatente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface RegistroPatenteRepository extends JpaRepository<RegistroPatente, Integer> {
    @Query("select obj from RegistroPatente obj where obj.docente.id in :ids")
    List<RegistroPatente> findAllByDocentes(Collection<Integer> ids);
}
