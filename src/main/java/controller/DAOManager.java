package controller;

import dao.AlunoDAO;
import dao.ConexaoHibernate;
import dao.DisciplinaDAO;
import dao.TurmaDAO;
import domain.Aluno;
import domain.Disciplina;
import domain.Turma;
import java.util.List;

public class DAOManager {

    private static DAOManager DAOManager;

    private DAOManager() throws Exception {

        ConexaoHibernate.getSessionFactory();
    }

    public static DAOManager getInstance() throws Exception {
        if (DAOManager == null) {
            DAOManager = new DAOManager();
            return DAOManager;
        }

        return DAOManager;
    }

    public Disciplina findByIdDisciplina(long codigoDisciplina) throws Exception {
        return DisciplinaDAO.findById(codigoDisciplina);
    }

    public List<Disciplina> listarDisciplinas() throws Exception {
        return DisciplinaDAO.findList();
    }

    public long inserirDisciplina(String descricaoDisciplina) throws Exception {
        Disciplina newDisc = new Disciplina(descricaoDisciplina);

        DisciplinaDAO.insert(newDisc);
        return newDisc.getCodigoDisciplina();
    }

    public void editarDisciplina(long codigoDisciplina, String descricaoDisciplina) throws Exception {
        Disciplina oldDisc = findByIdDisciplina(codigoDisciplina);
        oldDisc.setDescricaoDisciplina(descricaoDisciplina);
        DisciplinaDAO.update(oldDisc);
    }

    public void excluirDisciplina(long codigoDisciplina) throws Exception {
        DisciplinaDAO.delete(codigoDisciplina);
    }

    public Aluno findByIdAluno(long codigoAluno) throws Exception {
        return AlunoDAO.findById(codigoAluno);
    }

    public List<Aluno> listarAlunos() throws Exception {
        return AlunoDAO.findList();
    }

    public long inserirAluno(String nome, Turma turma) throws Exception {
        Aluno newAluno = new Aluno(nome, turma);

        AlunoDAO.insert(newAluno);
        return newAluno.getCodigoAluno();
    }

    public void editarAluno(long codigoAluno, String nome, Turma turma) throws Exception {
        Aluno oldAluno = findByIdAluno(codigoAluno);
        oldAluno.setNome(nome);
        oldAluno.setTurma(turma);

        AlunoDAO.update(oldAluno);
    }

    public void excluirAluno(long codigoAluno) throws Exception {
        AlunoDAO.delete(codigoAluno);
    }

    public List<Turma> listarTurmas() throws Exception {
        return TurmaDAO.findList();
    }
}
