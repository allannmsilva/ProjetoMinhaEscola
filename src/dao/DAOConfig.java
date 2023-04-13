package dao;

import java.sql.Statement;

public abstract class DAOConfig {

    public static Statement createStatement() throws Exception{
        Statement statement = ConexaoOracle.estabelecerConexao().createStatement();
        
        return statement;
    }
}
