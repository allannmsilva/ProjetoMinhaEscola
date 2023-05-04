/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoDisciplina;

    private String descricaoDisciplina;

    public Disciplina() {

    }

    public Disciplina(String descricaoDisciplina) {
        this.descricaoDisciplina = descricaoDisciplina;
    }

    public Disciplina(long codigoDisciplina, String descricaoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
    }

    public long getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(long codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getDescricaoDisciplina() {
        return descricaoDisciplina;
    }

    public void setDescricaoDisciplina(String descricaoDisciplina) {
        this.descricaoDisciplina = descricaoDisciplina;
    }

    public Object[] toArray() {
        return new Object[]{codigoDisciplina, descricaoDisciplina};
    }

}
