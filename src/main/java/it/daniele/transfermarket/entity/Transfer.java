package it.daniele.transfermarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.Map;

@Entity
public class Transfer {
    @Id
    private String nome;
    @Column
    private String passaggi;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Transfer{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", passaggi=").append(passaggi);
        sb.append('}');
        return sb.toString();
    }

    public Transfer() {
    }

    public Transfer(String nome, String passaggi) {
        this.nome = nome;
        this.passaggi = passaggi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassaggi() {
        return passaggi;
    }

    public void setPassaggi(String passaggi) {
        this.passaggi = passaggi;
    }

}
