package controller;

import dao.ConexaoOracle;
import dao.DisciplinaDAO;
import domain.Disciplina;
import java.util.List;

public class DAOManager {

    private static DAOManager DAOManager;

    private DisciplinaDAO disciplinaDAO;
//    private AlunoDAO alunoDAO;
//    private AnoDAO anoDAO;
//    private GradeDAO gradeDAO;
//    private TurmaDAO turmaDAO;

    private DAOManager() throws Exception {
        ConexaoOracle.estabelecerConexao();
        disciplinaDAO = new DisciplinaDAO();
    }

    public static DAOManager getInstance() throws Exception {
        if (DAOManager == null) {
            DAOManager = new DAOManager();
            return DAOManager;
        }

        return DAOManager;
    }

    public List<Disciplina> listarDisciplinas() throws Exception {
        return disciplinaDAO.findList();
    }

}
