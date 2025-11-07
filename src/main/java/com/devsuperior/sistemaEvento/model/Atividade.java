package com.devsuperior.sistemaEvento.model;

import com.github.f4b6a3.ulid.Ulid;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    private Ulid id;
    
    private String nome;
    
    @Column(columnDefinition ="TEXT")
    private String descricao;

    private Double preco;

    @ManyToOne()
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Atividade() {}

    public Ulid getId() {
        return id;
    }

    public void setId(Ulid id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
}
