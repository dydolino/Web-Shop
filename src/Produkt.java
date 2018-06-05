import java.util.ArrayList;
import java.util.List;

public class Produkt {

    private String nazwa;
    private Double cena;

    public Produkt(String nazwa, String cena) {
        if (!(nazwa.isEmpty() || cena.isEmpty())) {
            this.nazwa = nazwa;
            this.cena = Double.valueOf(cena);
        }
    }

    @Override
    public String toString() {
        return nazwa + " " + cena;
    }

    public static void add(List<Produkt> zakupy, String nazwa, String cena) {
        if (!(nazwa.isEmpty() || cena.isEmpty())) {
            zakupy.add(new Produkt(nazwa, cena));
        }
    }

    public static List<Double> bill(List<Produkt> shops) {
        List<Double> prices = new ArrayList<>();
        for (Produkt p : shops
                ) {
            prices.add(p.getCena());

        }
        return prices;
    }

    public static List<String> lista(List<Produkt> zakupy) {
        List<String> produkty = new ArrayList<>();
        for (Produkt p : zakupy
                ) {
            produkty.add(p.getNazwa());

        }
        return produkty;
    }


    public String getNazwa() {
        return nazwa;
    }

    public Double getCena() {
        return cena;
    }

}
