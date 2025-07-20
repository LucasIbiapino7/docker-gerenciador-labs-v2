package com.lab.backend.lattes.dtos;

import com.lab.backend.lattes.entities.Producao;

public class ProducaoDto {

    private final Integer id;
    private final String  tipo;            // 'P' ou 'C'
    private final String  titulo;
    private final Integer ano;
    private final String  doi;
    private final String  issnIsbnSigla;

    public ProducaoDto(Producao entity) {
        this.id = entity.getId();
        this.tipo = entity.getTipo();
        this.titulo  = entity.getTitulo();
        this.ano = entity.getAno();
        this.doi = entity.getDoi();
        this.issnIsbnSigla = entity.getIssnIsbnSigla();
    }

    public Integer getId()          { return id; }
    public String  getTipo()        { return tipo; }
    public String  getTitulo()      { return titulo; }
    public Integer getAno()         { return ano; }
    public String  getDoi()         { return doi; }
    public String  getIssnIsbnSigla() { return issnIsbnSigla; }
}
