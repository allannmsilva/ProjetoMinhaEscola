/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAOMethods.findList;
import domain.Grade;
import domain.GradePK;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class GradeDAO extends DAOMethods {

    public static List<Grade> pesquisarPorDisciplina(String descricaoDisciplina) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Grade.class);

            // FROM
            Root tabela = consulta.from(Grade.class);

            // RESTRIÇÕES
            Predicate restricoes = builder.like(tabela.get("chaveComposta").get("disciplina").get("descricaoDisciplina"), descricaoDisciplina + "%");

            consulta.where(restricoes);
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return lista;
    }

    public static List<Grade> findList() throws Exception {
        return findList(Grade.class);
    }

    public static Grade findById(GradePK id) throws Exception {
        Session sessao = null;
        Grade obj = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            obj = sessao.get(Grade.class, id);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException hex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }

        return obj;
    }
}
