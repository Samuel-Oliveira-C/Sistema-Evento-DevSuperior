package com.devsuperior.sistemaEvento.model;

import java.util.Set;

import com.github.f4b6a3.ulid.Ulid;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_participante")
public class Participante {
    @Id
    private Ulid id;

    private String nome;
    private String email;

    @ManyToMany
    @JoinTable(name = "tb_participante_atividade",
        joinColumns = @JoinColumn(name = "participante_id"),
        inverseJoinColumns = @JoinColumn(name = "atividade_id"))
    private Set<Atividade> atividades = new java.util.HashSet<>();

    public Participante() {}

    public Participante(Ulid id, String name, String email){
        this.id = id;
        this.nome = name;
        this.email = email;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    @Override
    public String toString() {
        return "Participante [id=" + id + ", nome=" + nome + ", email=" + email + ", atividades=" + atividades + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((atividades == null) ? 0 : atividades.hashCode());
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
        Participante other = (Participante) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (atividades == null) {
            if (other.atividades != null)
                return false;
        } else if (!atividades.equals(other.atividades))
            return false;
        return true;
    }
    
    
}
