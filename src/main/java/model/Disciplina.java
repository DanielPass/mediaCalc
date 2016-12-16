package model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;

/**
 * Created by daniel on 15/12/2016.
 */
@Entity
@Table(name = "disciplina")
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_disciplina;
    @NaturalId
    private String nome;

    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
