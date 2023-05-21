package dao;

import domain.Ano;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class AnoDAO {

    public static Ano findById(long id) throws Exception {
        return null;
    }

    public static List<Ano> findList() throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;
        List<Ano> resultList = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            CriteriaBuilder criteriaBuilder = sessao.getCriteriaBuilder();
            CriteriaQuery<Ano> criteriaQuery = criteriaBuilder.createQuery(Ano.class);
            Root<Ano> root = criteriaQuery.from(Ano.class);
            criteriaQuery.select(root);
            Query<Ano> query = sessao.createQuery(criteriaQuery);
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

    public static void insert(Ano body) throws Exception {
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

    public static void update(Ano body) throws Exception {
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

    public static void delete(Ano body) throws Exception {
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
