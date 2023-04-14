
package domain;

import factoryMethod.Pessoa;
import java.util.Date;

public class Professor extends Pessoa {

    private long codigoProfessor;
    private String formacao; 
    private double salario;

    public Professor(long codigoProfessor, String formacao, double salario, long rg, String nome, Date dataNascimento) {
        super(rg, nome, dataNascimento);
        this.codigoProfessor = codigoProfessor;
        this.formacao = formacao;
        this.salario = salario;
    }

    public long getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(long codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInformacoesPessoais() {
        
    }

}
