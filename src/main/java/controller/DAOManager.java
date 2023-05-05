package controller;

import dao.AlunoDAO;
import dao.AnoDAO;
import dao.ConexaoHibernate;
import dao.DisciplinaDAO;
import dao.GradeDAO;
import dao.TurmaDAO;
import domain.Disciplina;
import java.util.List;

public class DAOManager {

    private static DAOManager DAOManager;

    private DisciplinaDAO disciplinaDAO;
    private AlunoDAO alunoDAO;
    private AnoDAO anoDAO;
    private GradeDAO gradeDAO;
    private TurmaDAO turmaDAO;

    private DAOManager() throws Exception {
        ConexaoHibernate.getSessionFactory();
        
        disciplinaDAO = new DisciplinaDAO();
    }

    public static DAOManager getInstance() throws Exception {
        if (DAOManager == null) {
            DAOManager = new DAOManager();
            return DAOManager;
        }

        return DAOManager;
    }

    public Disciplina findByIdDisciplina(long codigoDisciplina) throws Exception {
        return disciplinaDAO.findById(codigoDisciplina);
    }

    public List<Disciplina> listarDisciplinas() throws Exception {
        return disciplinaDAO.findList();
    }

    public long inserirDisciplina(String descricaoDisciplina) throws Exception {
        Disciplina newDisc = new Disciplina(descricaoDisciplina);

        disciplinaDAO.insert(newDisc);
        return newDisc.getCodigoDisciplina();
    }

    public void editarDisciplina(long codigoDisciplina, String descricaoDisciplina) throws Exception {
        Disciplina oldDisc = findByIdDisciplina(codigoDisciplina);
        oldDisc.setDescricaoDisciplina(descricaoDisciplina);
        disciplinaDAO.update(oldDisc);
    }

    public void excluirDisciplina(long codigoDisciplina) throws Exception {
        disciplinaDAO.delete(codigoDisciplina);
    }

}
