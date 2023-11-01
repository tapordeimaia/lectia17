import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figura patrat = () -> System.out.println("Deseneaza patrat");
        Figura cerc = () -> System.out.println("Deseneaza cerc");
        Figura triunghi = () -> System.out.println("Deseneaza triunghi");
        patrat.deseneazaFigura();;
        cerc.deseneazaFigura();
        triunghi.deseneazaFigura();

        List<String> s = new ArrayList<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.remove(1);
        s.contains("A");
        int pozitia = s.indexOf("C");
        String c = s.get(pozitia);
//      s.set(2, "D");


        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.removeIf(y -> y.equals(2) || y.equals(7));
        System.out.println(listInt);
    }
}