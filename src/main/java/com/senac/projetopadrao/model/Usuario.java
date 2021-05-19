package com.senac.projetopadrao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private boolean EstadoCivil;

    private String dataNascimento;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean EstadoCivil() {
        boolean estadoCivil;
        estadoCivil = EstadoCivil;
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.EstadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return isDataNascimento();
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isEstadoCivil() {
        return EstadoCivil;
    }

    public String isDataNascimento() {
        return dataNascimento;
    }

    public void setDataDeNascimento(String s) {
    }
}
