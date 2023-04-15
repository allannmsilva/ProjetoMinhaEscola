package factoryMethod;

import domain.Aluno;

public class AlunoFactory implements PessoaFactory {

    @Override
    public Pessoa createPessoa() {
        return new Aluno();
    }

}
