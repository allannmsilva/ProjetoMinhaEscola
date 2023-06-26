/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAOMethods.findById;
import static dao.DAOMethods.findList;
import domain.Aluno;
import domain.Turma;
import java.util.InputMismatchException;
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
public class TurmaDAO extends DAOMethods {

    public static List<Turma> pesquisar(String descricaoTurma, String turno, int tipo) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Turma.class);

            // FROM
            Root tabela = consulta.from(Turma.class);

            // RESTRIÇÕES
            Predicate restricoes = null;

            switch (tipo) {
                case 0:
                    restricoes = builder.like(tabela.get("descricaoTurma"), descricaoTurma + "%");
                    break;
                case 1:
                    restricoes = builder.like(tabela.get("turno"), turno + "%");
                    break;
                case 2:
                    Predicate restricaoDescricao = builder.like(tabela.get("descricaoTurma"), descricaoTurma + "%");
                    Predicate restricaoTurno = builder.like(tabela.get("turno"), turno + "%");
                    restricoes = builder.and(restricaoDescricao, restricaoTurno);
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

    public static List<Turma> findList() throws Exception {
        return findList(Turma.class);
    }

    public static void insert(Turma t) throws Exception {
        validaTurma(t, false);
        DAOMethods.insert(t);
    }

    public static void update(Turma t) throws Exception {
        validaTurma(t, false);
        DAOMethods.update(t);
    }

    public static void delete(Turma t) throws Exception {
        validaTurma(t, true);
        DAOMethods.delete(t);
    }

    public static Turma findById(long id) {
        return (Turma) findById(Turma.class, id);
    }

    private static void validaTurma(Turma t, boolean delete) throws Exception {
        if (delete) {
            List<Aluno> alunos = AlunoDAO.findList();
            for (Aluno aluno : alunos) {
                if (aluno.getTurma().equals(t)) {
                    throw new IllegalArgumentException();
                }
            }

            return;
        }

        if (t.getDescricaoTurma().isEmpty()) {
            throw new NullPointerException();
        }

        if (t.getTurno() < 0) {
            throw new IllegalArgumentException();
        }

        List<Turma> turmas = TurmaDAO.findList();
        for (Turma turma : turmas) {
            if (turma.equals(t)) {
                throw new InputMismatchException();
            }
        }
    }
}
