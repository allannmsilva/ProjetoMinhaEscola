/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Disciplina;
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
public class DisciplinaDAO extends DAOMethods {

    public static List<Disciplina> pesquisarPorDescricao(String descricaoDisciplina) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Disciplina.class);

            // FROM
            Root tabela = consulta.from(Disciplina.class);

            // RESTRIÇÕES
            Predicate restricoes = builder.like(tabela.get("descricaoDisciplina"), descricaoDisciplina + "%");

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

    public static List<Disciplina> findList() throws Exception {
        return findList(Disciplina.class);
    }

    public static Disciplina findById(long id) {
        return (Disciplina) findById(Disciplina.class, id);
    }
}
