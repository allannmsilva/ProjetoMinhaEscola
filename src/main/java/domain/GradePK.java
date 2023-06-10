/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class GradePK implements Serializable {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoAno")
    private Ano ano;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoDisciplina")
    private Disciplina disciplina;

    public GradePK() {
    }

    public GradePK(Ano ano, Disciplina disciplina) {
        this.ano = ano;
        this.disciplina = disciplina;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GradePK other = (GradePK) obj;
        if (!Objects.equals(this.ano, other.ano)) {
            return false;
        }
        return Objects.equals(this.disciplina, other.disciplina);
    }

}
