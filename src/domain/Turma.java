/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoTurma;
    private String descricaoTurma;

    @ManyToOne(fetch = FetchType.EAGER)
    private Ano ano;
    private int turno;

    @OneToMany(mappedBy = "turma", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Aluno> alunos = new ArrayList();

    private enum eTurno {

        MATITUNO(0), VESPERTINO(1), NOTURNO(2);

        private int turno;

        eTurno(int turno) {
            this.turno = turno;
        }

        public int getTurno() {
            return turno;
        }
    }

    public Turma() {
    }

    public Turma(long codigoTurma, String descricaoTurma, Ano ano, int turno) {
        this.codigoTurma = codigoTurma;
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

}
