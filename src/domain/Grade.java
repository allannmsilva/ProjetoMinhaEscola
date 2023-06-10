package domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Grade implements Serializable {

    @EmbeddedId
    private GradePK chaveComposta;

    private String planoEstudos;

    public Grade() {
    }

    public Grade(GradePK chaveComposta, String planoEstudos) {
        this.chaveComposta = chaveComposta;
        this.planoEstudos = planoEstudos;
    }

    public String getPlanoEstudos() {
        return planoEstudos;
    }

    public void setPlanoEstudos(String planoEstudos) {
        this.planoEstudos = planoEstudos;
    }

}
