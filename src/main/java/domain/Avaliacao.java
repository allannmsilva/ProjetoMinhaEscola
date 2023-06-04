package domain;

import strategy.*;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Avaliacao implements Serializable {

    @EmbeddedId
    private AvaliacaoPK chaveComposta;
    private int notaMaximaAvaliacao;
    private double notaAluno;

    @Column(nullable = false)
    private String assunto;

    @Column(nullable = false)
    private int tipoAvaliacao;

    private static int NOTA_PROVA = 15;
    private static int NOTA_SEMINARIO = 25;
    private static int NOTA_TRABALHO = 10;

    public Avaliacao() {
    }

    public Avaliacao(AvaliacaoPK chaveComposta, String assunto, int tipoAvaliacao) {
        this.chaveComposta = chaveComposta;
        this.assunto = assunto;
        this.tipoAvaliacao = tipoAvaliacao;

        switch (this.tipoAvaliacao) {
            case 0:
                this.notaMaximaAvaliacao = NOTA_PROVA;
                break;
            case 1:
                this.notaMaximaAvaliacao = NOTA_SEMINARIO;
                break;
            case 2:
                this.notaMaximaAvaliacao = NOTA_TRABALHO;
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

    private enum eTipoAvaliacao {
        PROVA(0), SEMINARIO(1), TRABALHO(2);

        private final int tipoAvaliacao;

        eTipoAvaliacao(int tipoAvaliacao) {
            this.tipoAvaliacao = tipoAvaliacao;
        }

        public int getTipoAvaliacao() {
            return tipoAvaliacao;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Avaliacao objMirror = (Avaliacao) obj;
        return objMirror.chaveComposta == this.chaveComposta;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.chaveComposta);
        return hash;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "chaveComposta=" + chaveComposta + ", notaMaximaAvaliacao=" + notaMaximaAvaliacao + ", notaAluno=" + notaAluno + ", assunto=" + assunto + ", tipoAvaliacao=" + tipoAvaliacao + '}';
    }

}
