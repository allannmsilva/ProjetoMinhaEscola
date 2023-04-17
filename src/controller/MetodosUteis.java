package controller;

import dao.ConexaoOracle;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MetodosUteis {

    public static Statement createStatement() throws Exception {
        return ConexaoOracle.estabelecerConexao().createStatement();
    }

    public static PreparedStatement createStatement(String sql) throws Exception {
        String returnCols[] = {"CODIGO_DISCIPLINA"};
        return ConexaoOracle.estabelecerConexao().prepareStatement(sql, returnCols);
    }

    public static Date toDate(String s) throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);
        return formato.parse(s);
    }

    public static String toString(Date d) throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);
        return formato.format(d);
    }

    public static long toLong(String s) {
        return Long.parseLong(s);
    }
}
