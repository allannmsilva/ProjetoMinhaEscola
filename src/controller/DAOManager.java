package controller;

import dao.ConexaoOracle;
import dao.DisciplinaDAO;
import domain.Disciplina;
import java.sql.SQLException;
import java.util.List;

public class DAOManager {

    private DisciplinaDAO disciplinaDAO;
//    private AlunoDAO alunoDAO;
//    private AnoDAO anoDAO;
//    private GradeDAO gradeDAO;
//    private TurmaDAO turmaDAO;

    public DAOManager() throws ClassNotFoundException, SQLException {
        ConexaoOracle.estabelecerConexao();
        disciplinaDAO = new DisciplinaDAO();
    }

    public List<Disciplina> listarDisciplinas() throws ClassNotFoundException, SQLException {
        return disciplinaDAO.getList();
    }

}
