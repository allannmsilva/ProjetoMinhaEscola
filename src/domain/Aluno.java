package domain;

import java.util.Date;

public class Aluno {

    private long rg;
    private long turma;
    private String nome;
    private Date dataNascimento;

    public Aluno() {
    }

    public Aluno(long rg, String nome, Date dataNascimento, long turma) {
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public long getTurma() {
        return turma;
    }

    public void setTurma(long turma) {
        this.turma = turma;
    }
    
    

}
