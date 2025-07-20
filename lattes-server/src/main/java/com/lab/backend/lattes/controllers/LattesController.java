package com.lab.backend.lattes.controllers;

import com.lab.backend.lattes.dtos.PesquisaDto;
import com.lab.backend.lattes.services.LattesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/api/pesquisas")
public class LattesController {

    @Autowired
    private LattesService lattesService;

    @PostMapping("/batch")
    public ResponseEntity<Map<String, PesquisaDto>> buscarBatch(@RequestBody Collection<String> idsLattes) {
        Map<String, PesquisaDto> response = lattesService.buscarPorIds(idsLattes);
        return ResponseEntity.ok(response);
    }
}
