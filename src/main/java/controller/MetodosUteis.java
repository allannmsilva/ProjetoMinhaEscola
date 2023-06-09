package controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//MÉTODOS ÚTEIS
public class MetodosUteis {

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
