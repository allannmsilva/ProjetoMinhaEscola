package strategy;

public class Avaliacao {

    private long disciplina;
    private long aluno;
    private NotaAvaliacao notaAvaliacao;
    private double notaAluno;
    private String assunto;
    private int tipoAvaliacao;

    public Avaliacao() {
    }

    public Avaliacao(long disciplina, long aluno, String assunto, int tipoAvaliacao) {
        this.disciplina = disciplina;
        this.aluno = aluno;
        this.assunto = assunto;
        this.tipoAvaliacao = tipoAvaliacao;

        switch (this.tipoAvaliacao) {
            case 0:
                this.notaAvaliacao = new NotaAvaliacaoProva();
                break;
            case 1:
                this.notaAvaliacao = new NotaAvaliacaoSeminario();
                break;
            case 2:
                this.notaAvaliacao = new NotaAvaliacaoTrabalho();
        }
    }

    public long getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(long disciplina) {
        this.disciplina = disciplina;
    }

    public long getAluno() {
        return aluno;
    }

    public void setAluno(long aluno) {
        this.aluno = aluno;
    }

    public NotaAvaliacao getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public double getNotaAluno() {
        return notaAluno;
    }

    public void setNotaAluno(double notaAluno) {
        this.notaAluno = notaAluno;
    }
    
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    public void setTipoAvaliacao(int tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }

    public int getNotaMaxima() {
        return this.notaAvaliacao.getNotaMaxima();
    }

    public enum eTipoAvaliacao {
        PROVA(0), SEMINARIO(1), TRABALHO(2);

        private int tipoAvaliacao;

        eTipoAvaliacao(int tipoAvaliacao) {
            this.tipoAvaliacao = tipoAvaliacao;
        }

        public int getTipoAvaliacao() {
            return tipoAvaliacao;
        }
    }
    
}
