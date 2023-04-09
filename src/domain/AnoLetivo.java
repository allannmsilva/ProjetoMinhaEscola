package domain;

import java.time.Year;

public class AnoLetivo {

    private Year ano;

    private static AnoLetivo anoLetivo;

    public static AnoLetivo getInstance() {
        if (anoLetivo == null) {
            anoLetivo = new AnoLetivo();
        }

        return anoLetivo;
    }

    private AnoLetivo() {
        this.ano = Year.now();
    }

    public Year getAnoLetivo() {
        return ano;
    }

    public void setAnoLetivo(Year ano) {
        this.ano = ano;
    }

    public static void main(String args[]) {

        AnoLetivo anoLetivo = AnoLetivo.getInstance();
        AnoLetivo anoLetivo2 = AnoLetivo.getInstance();
        anoLetivo.setAnoLetivo(Year.of(2021));
        System.out.println(anoLetivo2.getAnoLetivo());
    }
}
