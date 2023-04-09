/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class Ano {

    private int ordinal;
    eGrau grau;

    public Ano() {
    }

    public Ano(int ordinal) {
        this.ordinal = ordinal;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public eGrau getGrau() {
        return grau;
    }

    public void setGrau(eGrau grau) {
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
