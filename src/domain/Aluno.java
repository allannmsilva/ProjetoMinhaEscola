package domain;

import factoryMethod.Pessoa;

public class Aluno extends Pessoa {

    private long codigoAluno;
    private long turma;

    public long getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(long codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public long getTurma() {
        return turma;
    }

    public void setTurma(long turma) {
        this.turma = turma;
    }

    @Override
    public void exibirInformacoesPessoais() {
        System.out.println( //
                "RG: " + this.getRg()
                + "\n"
                +//
                "Nome: " + this.getNome()
                + "\n"
                + //
                "Data de Nascimento: " + this.getDataNascimento()
                + "\n"
                + //
                "Turma: " + this.getTurma()
                + "\n");
    }

}
