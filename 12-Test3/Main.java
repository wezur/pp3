import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("jan", "kowalski");
        System.out.println(person);
        System.out.println(Isogram.isogram("red sun"));
        System.out.println(Isogram.isogram("blue water"));
        System.out.println(Isogram.isogram("BLUE water"));
        System.out.println(Isogram.isogram("my blue water"));

        System.out.println(new Logic(new boolean[] {true, false, false}).opposite());
        System.out.println(new Logic(new boolean[] {true, false, true, false}).opposite());
        System.out.println(new Logic(new boolean[] {true, false, true, true, false, true, false, true, false}).opposite());

        System.out.println(new Number(5, "101").get10());
        System.out.println(new Number(8, "10283").get10());

        System.out.println(new Cities(new String[] {"Warszawa", "Sopot", "Kielce", "Szczecin"}).filter('S').cities());

        Pizza p = new Pizza("Salami", 69);
        System.out.println(p.delivery());
        System.out.println(p.delivery(69));
        System.out.println(p.discount());
        System.out.println(p.getPrice());

        System.out.println(new Numbers(new int[] {6, 7, 6, 1, 4}).ok());
        System.out.println(new Numbers(new int[] {2, 5, 2, 8, 4}).ok());

        ArrayList<Product> al = new ArrayList<Product>();
        al.add(new Product("Toster", 2137));
        al.add(new Product("Piekarnik", 420));
        al.add(new Product("Kuchenka", 420));

        Collections.sort(al);
        for (Product product : al) {
            System.out.println(product.getName());
        }
    }
}
