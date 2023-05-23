/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import strategy.Avaliacao;

@Entity
public class Disciplina implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoDisciplina;

    @Column(nullable = false)
    private String descricaoDisciplina;

    @OneToMany(mappedBy = "chaveComposta.disciplina", fetch = FetchType.LAZY)
    private List<Grade> grades;

    @OneToMany(mappedBy = "chaveComposta.disciplina", fetch = FetchType.LAZY)
    private List<Avaliacao> avaliacoes;

    public Disciplina() {

    }

    public Disciplina(String descricaoDisciplina) {
        this.descricaoDisciplina = descricaoDisciplina;
    }

    public Disciplina(long codigoDisciplina, String descricaoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
    }

    public long getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(long codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getDescricaoDisciplina() {
        return descricaoDisciplina;
    }

    public void setDescricaoDisciplina(String descricaoDisciplina) {
        this.descricaoDisciplina = descricaoDisciplina;
    }

    public Object[] toArray() {
        return new Object[]{codigoDisciplina, descricaoDisciplina};
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

        final Disciplina objMirror = (Disciplina) obj;
        return objMirror.getCodigoDisciplina() == this.getCodigoDisciplina();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.codigoDisciplina ^ (this.codigoDisciplina >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return descricaoDisciplina;
    }

}
