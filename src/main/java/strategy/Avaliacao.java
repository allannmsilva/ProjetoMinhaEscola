package strategy;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Avaliacao implements Serializable {

    @EmbeddedId
    private AvaliacaoPK chaveComposta;
    private int notaMaximaAvaliacao;
    private double notaAluno;
    private String assunto;
    private int tipoAvaliacao;

    public Avaliacao() {
    }

    public Avaliacao(AvaliacaoPK chaveComposta, String assunto, int tipoAvaliacao) {
        this.chaveComposta = chaveComposta;
        this.assunto = assunto;
        this.tipoAvaliacao = tipoAvaliacao;

        switch (this.tipoAvaliacao) {
            case 0:
                this.notaMaximaAvaliacao = 15;
                break;
            case 1:
                this.notaMaximaAvaliacao = 25;
                break;
            case 2:
                this.notaMaximaAvaliacao = 10;
        }
    }

    public int getNotaMaximaAvaliacao() {
        return notaMaximaAvaliacao;
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
