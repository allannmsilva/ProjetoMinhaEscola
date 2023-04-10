package controller;

import dao.ConexaoOracle;
import dao.DisciplinaDAO;
import domain.Disciplina;
import java.util.List;

public class DAOManager {

    private DisciplinaDAO disciplinaDAO;
//    private AlunoDAO alunoDAO;
//    private AnoDAO anoDAO;
//    private GradeDAO gradeDAO;
//    private TurmaDAO turmaDAO;

    public DAOManager() throws Exception {
        ConexaoOracle.estabelecerConexao();
        disciplinaDAO = new DisciplinaDAO();
    }

    public List<Disciplina> listarDisciplinas() throws Exception {
        return disciplinaDAO.getList();
    }

}
