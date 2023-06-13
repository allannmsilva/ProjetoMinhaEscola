/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Aluno;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class AlunoDAO extends DAOMethods {

    private static List<Aluno> pesquisar(String nome, String turma, int tipo) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Aluno.class);

            // FROM
            Root tabela = consulta.from(Aluno.class);

            // RESTRIÇÕES
            Predicate restricoes = null;

            switch (tipo) {
                case 0:
                    restricoes = builder.like(tabela.get("nome"), nome + "%");
                    break;
                case 1:
                    restricoes = builder.like(tabela.get("turma").get("descricaoTurma"), turma + "%");
                    break;
                case 2:
                    Predicate restricaoNome = builder.like(tabela.get("nome"), nome + "%");
                    Predicate restricaoTurma = builder.like(tabela.get("turma").get("descricaoTurma"), turma + "%");
                    restricoes = builder.and(restricaoNome, restricaoTurma);
                    break;
            }

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

    public static List<Aluno> pesquisarPorNome(String nome) {
        return pesquisar(nome, null, 0);
    }

    public static List<Aluno> pesquisarPorTurma(String turma) {
        return pesquisar(null, turma, 1);
    }

    public static List<Aluno> pesquisarPorNomeETurma(String nome, String turma) {
        return pesquisar(nome, turma, 2);
    }
}
