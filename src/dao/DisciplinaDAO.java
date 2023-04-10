package dao;

import domain.Disciplina;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class DisciplinaDAO {

    public List<Disciplina> getList() throws Exception {

        Statement statement;
        statement = ConexaoOracle.estabelecerConexao().createStatement();
        List<Disciplina> disciplinasList = new LinkedList();
        Disciplina disciplina;

        String sql = "SELECT * FROM DISCIPLINA";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            disciplina = new Disciplina(resultSet.getLong("codigoDisciplina"), resultSet.getString("descricaoDisciplina"));
            disciplinasList.add(disciplina);
        }

        return disciplinasList;
    }
}
