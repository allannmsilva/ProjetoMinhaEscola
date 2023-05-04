/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ano implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoAno;
    
    private int ordinal;
    int grau;

    @OneToMany(mappedBy = "ANO", fetch = FetchType.LAZY)
    private List<Turma> turmas = new ArrayList();

    public Ano() {
    }

    public Ano(long codigoAno, int ordinal, int grau) {
        this.codigoAno = codigoAno;
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

    protected enum eGrau {

        FUNDAMENTAL_I(0), FUNDAMENTAL_II(1), MEDIO(2);

        protected int grau;

        eGrau(int grau) {
            this.grau = grau;
        }

        public int getGrau() {
            return grau;
        }
    }

}
