/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class Disciplina {

    private long codigoDisciplina;
    private String descricaoDisciplina;

    public Disciplina() {

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
    
}
