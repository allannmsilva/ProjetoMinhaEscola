package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoOracle {

    private static Connection conexao;

    public static Connection estabelecerConexao() throws Exception {

        if (conexao == null) {
            String servidor = "localhost:1521";
            String login = "ALLAN";
            String senha = "123";
            String nomeBanco = "CPAEREA";
            String url = "jdbc:oracle:thin:@//" + servidor + "/" + nomeBanco;

            Class.forName("oracle.jdbc.OracleDriver");
            conexao = DriverManager.getConnection(url, login, senha);
        }

        return conexao;
    }

}
