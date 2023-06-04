/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import dao.ConexaoHibernate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityTransaction;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

@Entity
public class Turma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoTurma;
    private String descricaoTurma;

    @ManyToOne(fetch = FetchType.EAGER)
    private Ano ano;

    @Column(nullable = false)
    private int turno;

    @OneToMany(mappedBy = "turma", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Aluno> alunos = new ArrayList();

    public Turma() {
    }

    public Turma(String descricaoTurma, Ano ano, int turno) {
        this.descricaoTurma = descricaoTurma;
        this.ano = ano;
        this.turno = turno;
    }

    public long getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(long codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public String getDescricaoTurma() {
        return descricaoTurma;
    }

    public void setDescricaoTurma(String descricaoTurma) {
        this.descricaoTurma = descricaoTurma;
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getTurnoDesc() {
        if (turno < 1) {
            return "MATUTINO";
        } else if (turno < 2) {
            return "VESPERTINO";
        } else {
            return "NOTURNO";
        }
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

        final Turma objMirror = (Turma) obj;
        return objMirror.getCodigoTurma() == this.getCodigoTurma();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.codigoTurma ^ (this.codigoTurma >>> 32));
        return hash;
    }

    @Override
    public String toString() {

        return descricaoTurma + " - " + ano.getOrdinalDescr() + " DO " + ano.getGrauDescr() + ", " + this.getTurnoDesc();
    }

    public Object[] toArray() {
        return new Object[]{descricaoTurma, ano, this.getTurnoDesc()};
    }

    public static Turma findById(long id) throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;
        Turma obj = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            CriteriaBuilder criteriaBuilder = sessao.getCriteriaBuilder();
            CriteriaQuery<Turma> criteriaQuery = criteriaBuilder.createQuery(Turma.class);
            Root<Turma> root = criteriaQuery.from(Turma.class);
            criteriaQuery.select(root).where(criteriaBuilder.gt(root.get("codigoTurma"), id));
            Query<Turma> query = sessao.createQuery(criteriaQuery);
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
