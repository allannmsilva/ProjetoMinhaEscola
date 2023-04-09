package domain;

public class Grade {

    private long ano;
    private long disciplina;
    private String planoEstudos;

    public Grade() {
    }

    public Grade(long ano, long disciplina, String planoEstudos) {
        this.ano = ano;
        this.disciplina = disciplina;
        this.planoEstudos = planoEstudos;
    }

    public long getAno() {
        return ano;
    }

    public void setAno(long ano) {
        this.ano = ano;
    }

    public long getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(long disciplina) {
        this.disciplina = disciplina;
    }

    public String getPlanoEstudos() {
        return planoEstudos;
    }

    public void setPlanoEstudos(String planoEstudos) {
        this.planoEstudos = planoEstudos;
    }

}
