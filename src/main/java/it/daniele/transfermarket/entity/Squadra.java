package it.daniele.transfermarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Squadra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Squadra{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Squadra() {
    }

    public Squadra(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public Squadra(String nome) {
        this.nome = nome;
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

    @Column
    private String nome;
}
