package com.lab.backend.lattes.dtos;

import com.lab.backend.lattes.entities.RegistroPatente;

public class PatenteDto {
    private final Integer id;
    private final String  tipo;          // PATENTE / PROGRAMA …
    private final String  titulo;
    private final String  dataDeposito;  // texto no dump
    private final String  codigo;        // número / código registro

    public PatenteDto(RegistroPatente r) {
        this.id = r.getId();
        this.tipo = r.getTipo();
        this.titulo = r.getTitulo();
        this.dataDeposito = r.getDataDeposito();
        this.codigo = r.getCodigo();
    }

    public Integer getId()          { return id; }
    public String  getTipo()        { return tipo; }
    public String  getTitulo()      { return titulo; }
    public String  getDataDeposito(){ return dataDeposito; }
    public String  getCodigo()      { return codigo; }
}
