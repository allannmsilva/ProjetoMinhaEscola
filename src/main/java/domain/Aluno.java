package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import strategy.Avaliacao;

@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoAluno;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoTurma")
    private Turma turma;

    @OneToMany(mappedBy = "chaveComposta.aluno", fetch = FetchType.LAZY)
    private List<Avaliacao> avaliacoes;

    public Aluno() {
    }

    public Aluno(String nome, Turma turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public long getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(long codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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

        final Aluno objMirror = (Aluno) obj;
        return objMirror.getCodigoAluno() == this.getCodigoAluno();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (this.codigoAluno ^ (this.codigoAluno >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Aluno{" + "codigoAluno=" + codigoAluno + ", nome=" + nome + ", turma=" + turma + ", avaliacoes=" + avaliacoes + '}';
    }

}
