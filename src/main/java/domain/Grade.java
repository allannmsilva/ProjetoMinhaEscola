package domain;

import java.io.Serializable;
import java.util.Objects;
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

    public GradePK getChaveComposta() {
        return chaveComposta;
    }

    public void setChaveComposta(GradePK chaveComposta) {
        this.chaveComposta = chaveComposta;
    }

    public String getPlanoEstudos() {
        return planoEstudos;
    }

    public void setPlanoEstudos(String planoEstudos) {
        this.planoEstudos = planoEstudos;
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

        final Grade objMirror = (Grade) obj;
        return objMirror.chaveComposta == this.chaveComposta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.chaveComposta);
        return hash;
    }

    @Override
    public String toString() {
        return "Grade{" + "chaveComposta=" + chaveComposta + ", planoEstudos=" + planoEstudos + '}';
    }

    public Object[] toArray() {
        return new Object[]{chaveComposta.getAno(), chaveComposta.getDisciplina(), planoEstudos};
    }
}
