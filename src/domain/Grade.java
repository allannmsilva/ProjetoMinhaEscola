package domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Grade implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    private Ano ano;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    private Disciplina disciplina;

    private String planoEstudos;

    public Grade() {
    }

    public Grade(Ano ano, Disciplina disciplina, String planoEstudos) {
        this.ano = ano;
        this.disciplina = disciplina;
        this.planoEstudos = planoEstudos;
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getPlanoEstudos() {
        return planoEstudos;
    }

    public void setPlanoEstudos(String planoEstudos) {
        this.planoEstudos = planoEstudos;
    }

}
