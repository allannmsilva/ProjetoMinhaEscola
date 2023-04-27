/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class Turma {

    private long codigoTurma;
    private String descricaoTurma;
    private Ano ano;
    private int turno;

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
