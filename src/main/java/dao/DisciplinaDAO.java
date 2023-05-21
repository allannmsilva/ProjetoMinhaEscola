package dao;

import domain.Disciplina;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class DisciplinaDAO {

    public static Disciplina findById(long id) throws Exception {
        return null;
    }

    public static List<Disciplina> findList() throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;
        List<Disciplina> resultList = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            CriteriaBuilder criteriaBuilder = sessao.getCriteriaBuilder();
            CriteriaQuery<Disciplina> criteriaQuery = criteriaBuilder.createQuery(Disciplina.class);
            Root<Disciplina> root = criteriaQuery.from(Disciplina.class);
            criteriaQuery.select(root);
            Query<Disciplina> query = sessao.createQuery(criteriaQuery);
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

    public static void insert(Disciplina body) throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            sessao.save(body);

            entityTransaction.commit();
            sessao.close();

        } catch (HibernateException hex) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }
    }

    public static void update(Disciplina body) throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            sessao.update(body);

            entityTransaction.commit();
            sessao.close();

        } catch (HibernateException hex) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }
    }

    public static void delete(Disciplina body) throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            sessao.delete(body);

            entityTransaction.commit();
            sessao.close();

        } catch (HibernateException hex) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }
    }
}
