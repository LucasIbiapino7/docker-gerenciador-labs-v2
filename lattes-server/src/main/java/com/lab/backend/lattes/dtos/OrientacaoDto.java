package com.lab.backend.lattes.dtos;

import com.lab.backend.lattes.entities.Orientacao;

public class OrientacaoDto {
    private final Integer id;
    private final String  tipo;     // MESTRADO / DOUTORADO …
    private final String  titulo;
    private final Integer ano;
    private final String  discente;

    public OrientacaoDto(Orientacao o) {
        this.id = o.getId();
        this.tipo = o.getTipo();
        this.titulo = o.getTitulo();
        this.ano = o.getAno();
        this.discente = o.getDiscente();
    }

    public Integer getId()     { return id; }
    public String  getTipo()   { return tipo; }
    public String  getTitulo() { return titulo; }
    public Integer getAno()    { return ano; }
    public String  getDiscente() { return discente; }
}
