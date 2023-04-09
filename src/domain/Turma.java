/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class Turma {

    private char descricaoTurma;
    private long ano;
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

    public Turma(char descricaoTurma, long ano, int turno) {
        this.descricaoTurma = descricaoTurma;
        this.ano = ano;
        this.turno = turno;
    }

    public char getDescricaoTurma() {
        return descricaoTurma;
    }

    public void setDescricaoTurma(char descricaoTurma) {
        this.descricaoTurma = descricaoTurma;
    }

    public long getAno() {
        return ano;
    }

    public void setAno(long ano) {
        this.ano = ano;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

}
