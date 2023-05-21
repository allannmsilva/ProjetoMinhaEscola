package controller;

import dao.ConexaoHibernate;
import dao.DAOMethods;
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

    public Disciplina findByIdDisciplina(long id) throws Exception {
        return (Disciplina) DAOMethods.findById(Disciplina.class, id);
    }

    public List<Disciplina> listarDisciplinas() throws Exception {
        return DAOMethods.findList(Disciplina.class);
    }

    public void inserirDisciplina(Disciplina d) throws Exception {
        DAOMethods.insert(d);
    }
}
