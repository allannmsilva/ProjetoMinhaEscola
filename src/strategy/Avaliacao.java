package strategy;

public class Avaliacao {

    private long disciplina;
    private String assunto;
    private eTipoAvaliacao tipoAvaliacao;
    private NotaAvaliacao notaAvaliacao;

    public Avaliacao() {
    }

    public Avaliacao(long disciplina, String assunto, eTipoAvaliacao tipoAvaliacao) {
        this.disciplina = disciplina;
        this.assunto = assunto;
        this.tipoAvaliacao = tipoAvaliacao;

        switch (this.tipoAvaliacao.getTipoAvaliacao()) {
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

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public eTipoAvaliacao getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    public void setTipoAvaliacao(eTipoAvaliacao tipoAvaliacao) {
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

    public static void main(String args[]) {

        Avaliacao avaliacao = new Avaliacao(1, "Termodinâmica", eTipoAvaliacao.TRABALHO);
        System.out.println("Nota avaliação: " + avaliacao.getNotaMaxima()); 
    }
}
