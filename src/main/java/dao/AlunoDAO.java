package dao;

import domain.Aluno;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class AlunoDAO {

    public static Aluno findById(long id) throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;
        Aluno aluno = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            aluno = sessao.find(Aluno.class, id);

            entityTransaction.commit();
            sessao.close();

        } catch (HibernateException hex) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }

        return aluno;
    }

    public static List<Aluno> findList() throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;
        List<Aluno> resultList = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            CriteriaBuilder criteriaBuilder = sessao.getCriteriaBuilder();
            CriteriaQuery<Aluno> criteriaQuery = criteriaBuilder.createQuery(Aluno.class);
            Root<Aluno> root = criteriaQuery.from(Aluno.class);
            criteriaQuery.select(root);
            Query<Aluno> query = sessao.createQuery(criteriaQuery);
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

    public static void insert(Aluno body) throws Exception {
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

    public static void update(Aluno body) throws Exception {
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

    public static void delete(Aluno body) throws Exception {
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
