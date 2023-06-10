/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import dao.ConexaoHibernate;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityTransaction;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

@Entity
public class Ano implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoAno;

    @Column(nullable = false)
    private int ordinal;

    @Column(nullable = false)
    private int grau;

    @OneToMany(mappedBy = "ano", fetch = FetchType.LAZY)
    private List<Turma> turmas;

    @OneToMany(mappedBy = "chaveComposta.ano", fetch = FetchType.LAZY)
    private List<Grade> grades;

    public Ano() {
    }

    public Ano(int ordinal, int grau) {
        this.ordinal = ordinal;
        this.grau = grau;
    }

    public long getCodigoAno() {
        return codigoAno;
    }

    public void setCodigoAno(long codigoAno) {
        this.codigoAno = codigoAno;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public String getGrauDescr() {
        if (this.grau < 1) {
            return "FUNDAMENTAL I";
        } else if (grau < 2) {
            return "FUNDAMENTAL II";
        } else {
            return "MÉDIO";
        }
    }

    public String getOrdinalDescr() {
        return this.ordinal + "° ANO";
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

        final Ano objMirror = (Ano) obj;
        return objMirror.getCodigoAno() == this.getCodigoAno();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.codigoAno ^ (this.codigoAno >>> 32));
        return hash;
    }

    @Override
    public String toString() {

        return this.getOrdinalDescr() + " DO " + this.getGrauDescr();
    }

}
