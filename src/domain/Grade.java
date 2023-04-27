package domain;

public class Grade {

    private Ano ano;
    private Disciplina disciplina;
    private String planoEstudos;

    public Grade() {
    }

    public Grade(Ano ano, Disciplina disciplina, String planoEstudos) {
        this.ano = ano;
        this.disciplina = disciplina;
        this.planoEstudos = planoEstudos;
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getPlanoEstudos() {
        return planoEstudos;
    }

    public void setPlanoEstudos(String planoEstudos) {
        this.planoEstudos = planoEstudos;
    }

}
