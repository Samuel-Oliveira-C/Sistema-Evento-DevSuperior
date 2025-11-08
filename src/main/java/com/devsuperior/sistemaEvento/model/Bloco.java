package com.devsuperior.sistemaEvento.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.github.f4b6a3.ulid.Ulid;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bloco")
public class Bloco {
    @Id
    private Ulid id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;
    
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public Bloco() {}

    public Bloco(Ulid id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Ulid getId() {
        return id;
    }

    public void setId(Ulid id) {
        this.id = id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }

    public Atividade getAtividade() {
        return atividade;
    }
    
    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
    @Override
    public String toString() {
        return "Bloco [id=" + id + ", inicio=" + inicio + ", fim=" + fim + ", atividade=" + atividade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
        result = prime * result + ((fim == null) ? 0 : fim.hashCode());
        result = prime * result + ((atividade == null) ? 0 : atividade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bloco other = (Bloco) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (inicio == null) {
            if (other.inicio != null)
                return false;
        } else if (!inicio.equals(other.inicio))
            return false;
        if (fim == null) {
            if (other.fim != null)
                return false;
        } else if (!fim.equals(other.fim))
            return false;
        if (atividade == null) {
            if (other.atividade != null)
                return false;
        } else if (!atividade.equals(other.atividade))
            return false;
        return true;
    }
}

