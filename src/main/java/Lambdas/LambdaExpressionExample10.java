package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample10 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        list.add(new Product(1, "HP", 2500f));
        list.add(new Product(48, "keyboard", 20f));
        list.add(new Product(13, "mouse", 2f));

        System.out.println("Sorting on the basis name");
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

        Collections.sort(list, (b1, b2) ->
                Integer.compare(b1.id, b2.id)
        );
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

        Collections.sort(list, (s1, s2) ->
                Float.compare(s1.price, s2.price));

        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
    }
}