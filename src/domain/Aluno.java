package domain;

import factoryMethod.Pessoa;
import java.util.Date;

public class Aluno extends Pessoa {

    private long codigoAluno;
    private long turma;

    public Aluno(long rg, String nome, Date dataNascimento, long turma) {
        super(rg, nome, dataNascimento);
        this.turma = turma;
    }

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
                + //
                " Nome: " + this.getNome()
                + //
                " Turma: " + this.getTurma()
                + //
                " Data de Nascimento: " + this.getDataNascimento());
    }

}
