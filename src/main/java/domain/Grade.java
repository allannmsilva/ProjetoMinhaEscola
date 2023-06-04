package domain;

import dao.ConexaoHibernate;
import java.io.Serializable;
import java.util.Objects;
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
public class Grade implements Serializable {

    @EmbeddedId
    private GradePK chaveComposta;

    private String planoEstudos;

    public Grade() {
    }

    public Grade(GradePK chaveComposta, String planoEstudos) {
        this.chaveComposta = chaveComposta;
        this.planoEstudos = planoEstudos;
    }

    public String getPlanoEstudos() {
        return planoEstudos;
    }

    public void setPlanoEstudos(String planoEstudos) {
        this.planoEstudos = planoEstudos;
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

        final Grade objMirror = (Grade) obj;
        return objMirror.chaveComposta == this.chaveComposta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.chaveComposta);
        return hash;
    }

    @Override
    public String toString() {
        return "Grade{" + "chaveComposta=" + chaveComposta + ", planoEstudos=" + planoEstudos + '}';
    }

    public Object[] toArray() {
        return new Object[]{chaveComposta.getAno(), chaveComposta.getDisciplina(), planoEstudos};
    }

    public static Grade findById(long id) throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;
        Grade obj = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            CriteriaBuilder criteriaBuilder = sessao.getCriteriaBuilder();
            CriteriaQuery<Grade> criteriaQuery = criteriaBuilder.createQuery(Grade.class);
            Root<Grade> root = criteriaQuery.from(Grade.class);
            criteriaQuery.select(root).where(criteriaBuilder.gt(root.get("chaveComposta"), id));
            Query<Grade> query = sessao.createQuery(criteriaQuery);
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
