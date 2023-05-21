package dao;

import domain.Turma;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class TurmaDAO {

    public static Turma findById(long id) throws Exception {
        return null;
    }

    public static List<Turma> findList() throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;
        List<Turma> resultList = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            CriteriaBuilder criteriaBuilder = sessao.getCriteriaBuilder();
            CriteriaQuery<Turma> criteriaQuery = criteriaBuilder.createQuery(Turma.class);
            Root<Turma> root = criteriaQuery.from(Turma.class);
            criteriaQuery.select(root);
            Query<Turma> query = sessao.createQuery(criteriaQuery);
            resultList = query.getResultList();

            entityTransaction.commit();
            sessao.close();

        } catch (HibernateException hex) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }

        return resultList;
    }
    
    public static void insert(Turma body) throws Exception {
    }

    public static void update(Turma body) throws Exception {
    }

    public static void delete(long id) throws Exception {
    }
}
