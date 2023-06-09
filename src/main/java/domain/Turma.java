/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma implements Serializable, Comparable<Turma> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoTurma;

    @Column(nullable = false)
    private String descricaoTurma;

    @ManyToOne(fetch = FetchType.EAGER)
    private Ano ano;

    @Column(nullable = false)
    private int turno;

    @OneToMany(mappedBy = "turma", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Aluno> alunos = new ArrayList();

    public Turma() {
    }

    public Turma(String descricaoTurma, Ano ano, int turno) {
        this.descricaoTurma = descricaoTurma;
        this.ano = ano;
        this.turno = turno;
    }

    public long getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(long codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public String getDescricaoTurma() {
        return descricaoTurma;
    }

    public void setDescricaoTurma(String descricaoTurma) {
        this.descricaoTurma = descricaoTurma;
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getTurnoDesc() {
        if (turno < 1) {
            return "MATUTINO";
        } else if (turno < 2) {
            return "VESPERTINO";
        } else {
            return "NOTURNO";
        }
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

        if (!getDescricaoTurma().equals(((Turma) obj).getDescricaoTurma())) {
            return false;
        }

        if (!getAno().equals(((Turma) obj).getAno())) {
            return false;
        }

        return getTurno() == (((Turma) obj).getTurno());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.codigoTurma ^ (this.codigoTurma >>> 32));
        return hash;
    }

    @Override
    public String toString() {

        return descricaoTurma + " - " + ano.getOrdinalDescr() + " DO " + ano.getGrauDescr() + ", " + this.getTurnoDesc();
    }

    public Object[] toArray() {
        return new Object[]{codigoTurma, descricaoTurma, ano, this.getTurnoDesc()};
    }

    @Override
    public int compareTo(Turma o) {
        if (this.getAno().getGrauDescr().compareTo(o.getAno().getGrauDescr()) == 0) {
            if (this.getAno().getOrdinalDescr().compareTo(o.getAno().getOrdinalDescr()) == 0) {
                return this.getTurno() > o.getTurno() ? 1 : (this.getTurno() < o.getTurno() ? -1 : 0);
            }

            return this.getAno().getOrdinalDescr().compareTo(o.getAno().getOrdinalDescr());
        }

        return this.getAno().getGrauDescr().compareTo(o.getAno().getGrauDescr());
    }
}
