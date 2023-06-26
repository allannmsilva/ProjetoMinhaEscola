/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Disciplina;
import domain.Grade;
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
    
    public static void insert(Disciplina d) throws Exception {
        validaDisciplina(d, false);
        DAOMethods.insert(d);
    }
    
    public static void update(Disciplina d) throws Exception {
        validaDisciplina(d, false);
        DAOMethods.update(d);
    }
    
    public static void delete(Disciplina d) throws Exception {
        validaDisciplina(d, true);
        DAOMethods.delete(d);
    }
    
    private static void validaDisciplina(Disciplina d, boolean delete) throws Exception {
        if (delete) {
            List<Grade> grades = GradeDAO.findList();
            for (Grade grade : grades) {
                if (grade.getChaveComposta().getDisciplina().equals(d)) {
                    throw new IllegalArgumentException();
                }
            }
            
            return;
        }
        
        if (d.getDescricaoDisciplina().isEmpty()) {
            throw new NullPointerException();
        }
        
        List<Disciplina> disciplinas = DisciplinaDAO.findList();
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.equals(d)) {
                throw new InputMismatchException();
            }
        }
    }
}
