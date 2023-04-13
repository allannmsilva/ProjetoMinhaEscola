package dao;

import domain.Disciplina;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class DisciplinaDAO extends DAOConfig {

    public List<Disciplina> findList() throws Exception {

        Statement statement = createStatement();
        
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

    public static Disciplina findById(long id) throws Exception {
        
        Statement statement;
        statement = ConexaoOracle.estabelecerConexao().createStatement();
        
        String sql = "SELECT * FROM DISCIPLINA WHERE DISCIPLINA.CODIGO_DISCIPLINA = " + id;
        
        ResultSet resultSet = statement.executeQuery(sql);
        
        Disciplina disciplina = new Disciplina(resultSet.getLong("codigoDisciplina"), resultSet.getString("descricaoDisciplina"));
        
        return disciplina;
    }

    public static void delete(long...id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void insert(Disciplina body) throws Exception {
        
    }

    public static void update(Disciplina body) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) throws Exception{
        DisciplinaDAO.findById(1L);
    }
}
