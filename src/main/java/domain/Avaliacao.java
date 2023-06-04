package domain;

import dao.ConexaoHibernate;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

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

    public static Avaliacao findById(long id) throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;
        Avaliacao obj = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            CriteriaBuilder criteriaBuilder = sessao.getCriteriaBuilder();
            CriteriaQuery<Avaliacao> criteriaQuery = criteriaBuilder.createQuery(Avaliacao.class);
            Root<Avaliacao> root = criteriaQuery.from(Avaliacao.class);
            criteriaQuery.select(root).where(criteriaBuilder.gt(root.get("chaveComposta"), id));
            Query<Avaliacao> query = sessao.createQuery(criteriaQuery);
            obj = query.getResultList().get(0);

            sessao.close();

        } catch (HibernateException hex) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }

        return obj;
    }

}
