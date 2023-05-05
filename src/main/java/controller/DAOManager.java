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

}
