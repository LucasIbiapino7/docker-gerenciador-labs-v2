package com.lab.backend.lattes.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

import java.util.HashSet;
import java.util.Set;

@Immutable
@Entity
@Table(name = "producao")
public class Producao {

    @Id
    @Column(name = "id_producao")
    private Integer id;
    @Column(name = "tipo")
    private String tipo; // 'P' = periódico, 'C' = congresso
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "ano")
    private Integer ano;
    @Column(name = "doi")
    private String doi;
    @Column(name = "issn_isbn_sigla")
    private String issnIsbnSigla;
    @ManyToMany
    @JoinTable(
            name = "docente_producao",
            joinColumns = @JoinColumn(name = "id_producao"),
            inverseJoinColumns = @JoinColumn(name = "id_docente")
    )
    private Set<Docente> docentes = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getDoi() {
        return doi;
    }

    public String getIssnIsbnSigla() {
        return issnIsbnSigla;
    }

    public Set<Docente> getDocentes() {
        return docentes;
    }
}


