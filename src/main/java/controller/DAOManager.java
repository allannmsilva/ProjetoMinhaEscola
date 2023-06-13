package controller;

import dao.AlunoDAO;
import dao.ConexaoHibernate;
import dao.DAOMethods;
import domain.Aluno;
import domain.Ano;
import domain.Disciplina;
import domain.Grade;
import domain.Turma;
import java.util.List;
import domain.Avaliacao;
import domain.GradePK;

//GERENCIADOR DE MANIPULAÇÃO DE DADOS PROGRAMA-BANCO
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

    //DISCIPLINA
    public Disciplina findByIdDisciplina(long id) throws Exception {
        return (Disciplina) DAOMethods.findById(Disciplina.class, id);
    }

    public List<Disciplina> listarDisciplinas() throws Exception {
        return DAOMethods.findList(Disciplina.class);
    }

    public void inserirDisciplina(Disciplina d) throws Exception {
        DAOMethods.insert(d);
    }

    public void alterarDisciplina(Disciplina d) throws Exception {
        DAOMethods.update(d);
    }

    public void excluirDisciplina(Disciplina d) throws Exception {
        DAOMethods.delete(d);
    }

    //ALUNO
    public Aluno findByIdAluno(long id) throws Exception {
        return (Aluno) DAOMethods.findById(Aluno.class, id);
    }

    public List<Aluno> listarAlunos() throws Exception {
        return DAOMethods.findList(Aluno.class);
    }

    public void inserirAluno(Aluno a) throws Exception {
        DAOMethods.insert(a);
    }

    public void alterarAluno(Aluno a) throws Exception {
        DAOMethods.update(a);
    }

    public void excluirAluno(Aluno a) throws Exception {
        DAOMethods.delete(a);
    }

    public List<Aluno> pesquisarAlunoPorNome(String nome) {
        return AlunoDAO.pesquisarPorNome(nome);
    }

    public List<Aluno> pesquisarAlunoPorTurma(String turma) {
        return AlunoDAO.pesquisarPorTurma(turma);
    }

    public List<Aluno> pesquisarAlunoPorNomeETurma(String nome, String turma) {
        return AlunoDAO.pesquisarPorNomeETurma(nome, turma);
    }

    //ANO
    public Ano findByIdAno(long id) throws Exception {
        return (Ano) DAOMethods.findById(Ano.class, id);
    }

    public List<Ano> listarAnos() throws Exception {
        return DAOMethods.findList(Ano.class);
    }

    public void inserirAno(Ano a) throws Exception {
        DAOMethods.insert(a);
    }

    public void alterarAno(Ano a) throws Exception {
        DAOMethods.update(a);
    }

    public void excluirAno(Ano a) throws Exception {
        DAOMethods.delete(a);
    }

    //GRADE
    public Grade findByIdGrade(GradePK id) throws Exception {
        return Grade.findById(id);
    }

    public List<Grade> listarGrades() throws Exception {
        return DAOMethods.findList(Grade.class);
    }

    public void inserirGrade(Grade g) throws Exception {
        DAOMethods.insert(g);
    }

    public void alterarGrade(Grade g) throws Exception {
        DAOMethods.update(g);
    }

    public void excluirGrade(Grade g) throws Exception {
        DAOMethods.delete(g);
    }

    //TURMA
    public Turma findByIdTurma(long id) throws Exception {
        return (Turma) DAOMethods.findById(Turma.class, id);
    }

    public List<Turma> listarTurmas() throws Exception {
        return DAOMethods.findList(Turma.class);
    }

    public void inserirTurma(Turma t) throws Exception {
        DAOMethods.insert(t);
    }

    public void alterarTurma(Turma t) throws Exception {
        DAOMethods.update(t);
    }

    public void excluirTurma(Turma t) throws Exception {
        DAOMethods.delete(t);
    }

    //AVALIAÇÃO
    public Avaliacao findByIdAvaliacao(long id) throws Exception {
        return (Avaliacao) DAOMethods.findById(Avaliacao.class, id);
    }

    public List<Avaliacao> listarAvaliacoes() throws Exception {
        return DAOMethods.findList(Avaliacao.class);
    }

    public void inserirAvaliacao(Avaliacao a) throws Exception {
        DAOMethods.insert(a);
    }

    public void alterarAvaliacao(Avaliacao a) throws Exception {
        DAOMethods.update(a);
    }

    public void excluirAvaliacao(Avaliacao a) throws Exception {
        DAOMethods.delete(a);
    }
}
