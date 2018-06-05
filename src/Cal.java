import java.util.List;

public class Cal {

    public double average(List<Produkt> shops){
        double result=summ(shops)/shops.size();
        return result;
    }

    public double summ(List<Produkt> shops){
        double result=0;
        for (Produkt p:shops) {
            result=result+p.getCena();
        }
        return result;
    }
}