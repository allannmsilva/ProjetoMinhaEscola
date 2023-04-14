package domain;

public class Grade {

    private long codigoAno;
    private long codigoDisciplina;
    private String planoEstudos;

    public Grade() {
    }

    public Grade(long codigoAno, long codigoDisciplina, String planoEstudos) {
        this.codigoAno = codigoAno;
        this.codigoDisciplina = codigoDisciplina;
        this.planoEstudos = planoEstudos;
    }

    public long getCodigoAno() {
        return codigoAno;
    }

    public void setCodigoAno(long codigoAno) {
        this.codigoAno = codigoAno;
    }

    public long getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setDisciplina(long codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getPlanoEstudos() {
        return planoEstudos;
    }

    public void setPlanoEstudos(String planoEstudos) {
        this.planoEstudos = planoEstudos;
    }

}
