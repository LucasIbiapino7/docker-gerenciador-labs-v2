package com.lab.backend.lattes.dtos;

import com.lab.backend.lattes.entities.Premio;

public class PremioDto {
    private final Integer id;
    private final String  nomePremio;
    private final String  entidade;
    private final String  ano;

    public PremioDto(Premio p) {
        this.id = p.getId();
        this.nomePremio = p.getNomePremio();
        this.entidade = p.getEntidade();
        this.ano = p.getAno();
    }

    public Integer getId()        { return id; }
    public String  getNomePremio(){ return nomePremio; }
    public String  getEntidade()  { return entidade; }
    public String  getAno()       { return ano; }
}
