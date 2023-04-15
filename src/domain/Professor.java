package domain;

import factoryMethod.Pessoa;

public class Professor extends Pessoa {

    private long codigoProfessor;
    private String formacao;
    private double salario;

    public Professor() {
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
        System.out.println( //
                "RG: " + this.getRg()
                + "\n"
                +//
                "Nome: " + this.getNome()
                + "\n"
                +//
                "Data de Nascimento: " + this.getDataNascimento()
                + "\n"
                +//
                "Formação: " + this.getFormacao()
                + "\n"
                +//
                "Salário: " + this.getSalario()
                + "\n");
    }

}
