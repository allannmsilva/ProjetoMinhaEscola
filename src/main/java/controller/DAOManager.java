package controller;

import dao.AlunoDAO;
import dao.ConexaoHibernate;
import dao.DAOMethods;
import dao.DisciplinaDAO;
import dao.GradeDAO;
import dao.TurmaDAO;
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
        return DisciplinaDAO.findById(id);
    }

    public List<Disciplina> listarDisciplinas() throws Exception {
        return DisciplinaDAO.findList();
    }

    public void inserirDisciplina(Disciplina d) throws Exception {
        DisciplinaDAO.insert(d);
    }

    public void alterarDisciplina(Disciplina d) throws Exception {
        DisciplinaDAO.update(d);
    }

    public void excluirDisciplina(Disciplina d) throws Exception {
        DisciplinaDAO.delete(d);
    }

    public List<Disciplina> pesquisarDisciplinaPorDescricao(String descricao) {
        return DisciplinaDAO.pesquisarPorDescricao(descricao);
    }

    //ALUNO
    public Aluno findByIdAluno(long id) throws Exception {
        return AlunoDAO.findById(id);
    }

    public List<Aluno> listarAlunos() throws Exception {
        return AlunoDAO.findList();
    }

    public void inserirAluno(Aluno a) throws Exception {
        AlunoDAO.insert(a);
    }

    public void alterarAluno(Aluno a) throws Exception {
        AlunoDAO.update(a);
    }

    public void excluirAluno(Aluno a) throws Exception {
        AlunoDAO.delete(a);
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
        List<Ano> anosExistentes = this.listarAnos();

        for (Ano ano : anosExistentes) {
            if (ano.getGrau() == a.getGrau() && ano.getOrdinal() == a.getOrdinal()) {
                throw new IllegalArgumentException();
            }
        }

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
        return GradeDAO.findById(id);
    }

    public List<Grade> listarGrades() throws Exception {
        return GradeDAO.findList();
    }

    public void inserirGrade(Grade g) throws Exception {
        GradeDAO.insert(g);
    }

    public void alterarGrade(Grade g) throws Exception {
        GradeDAO.update(g);
    }

    public void excluirGrade(Grade g) throws Exception {
        GradeDAO.delete(g);
    }

    public List<Grade> pesquisarGradePorDisciplina(String disciplina) {
        return GradeDAO.pesquisarPorDisciplina(disciplina);
    }

    //TURMA
    public Turma findByIdTurma(long id) throws Exception {
        return (Turma) TurmaDAO.findById(id);
    }

    public List<Turma> listarTurmas() throws Exception {
        return TurmaDAO.findList();
    }

    public void inserirTurma(Turma t) throws Exception {
        TurmaDAO.insert(t);
    }

    public void alterarTurma(Turma t) throws Exception {
        TurmaDAO.update(t);
    }

    public void excluirTurma(Turma t) throws Exception {
        TurmaDAO.delete(t);
    }

    public List<Turma> pesquisarTurmaPorDescricao(String descricao) {
        return TurmaDAO.pesquisar(descricao, null, 0);
    }

    public List<Turma> pesquisarTurmaPorTurno(String turno) {
        return TurmaDAO.pesquisar(null, turno, 1);
    }

    public List<Turma> pesquisarTurmaPorDescricaoETurno(String descricao, String turno) {
        return TurmaDAO.pesquisar(descricao, turno, 2);
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
