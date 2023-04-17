package dao;

import controller.MetodosUteis;
import domain.Disciplina;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class DisciplinaDAO {

    public List<Disciplina> findList() throws Exception {

        Statement statement = MetodosUteis.createStatement();

        List<Disciplina> disciplinasList = new LinkedList();
        Disciplina disciplina;

        String sql = "SELECT * FROM DISCIPLINA";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            disciplina = new Disciplina(resultSet.getLong("CODIGO_DISCIPLINA"), resultSet.getString("DESCRICAO_DISCIPLINA"));
            disciplinasList.add(disciplina);
        }

        return disciplinasList;
    }

    public static Disciplina findById(long id) throws Exception {

        Statement statement = MetodosUteis.createStatement();

        String sql = "SELECT * FROM DISCIPLINA WHERE DISCIPLINA.CODIGO_DISCIPLINA = " + id;

        ResultSet resultSet = statement.executeQuery(sql);

        Disciplina disciplina = new Disciplina(resultSet.getLong("codigoDisciplina"), resultSet.getString("descricaoDisciplina"));

        return disciplina;
    }

    public static void delete(long... id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void insert(Disciplina body) throws Exception {

        String sql = "INSERT INTO DISCIPLINA (DESCRICAO_DISCIPLINA) VALUES (?)";

        PreparedStatement pStatement = MetodosUteis.createStatement(sql);
        pStatement.setString(1, body.getDescricaoDisciplina());

        pStatement.execute();

        ResultSet resultSet = pStatement.getGeneratedKeys();
        if (resultSet.next()) {
            long codigoDisciplina = resultSet.getLong(1);
            body.setCodigoDisciplina(codigoDisciplina);
        }
    }

    public static void update(Disciplina body) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
