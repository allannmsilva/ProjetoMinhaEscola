package factoryMethod;

import domain.Professor;

public class ProfessorFactory implements PessoaFactory {

    @Override
    public Pessoa createPessoa() {
        return new Professor();
    }

}
