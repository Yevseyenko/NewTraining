package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample11 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Samsung A5", 17000f));
        list.add(new Product(2, "nOKIA", 1000f));
        list.add(new Product(4, "iPHONE", 3000f));
        list.add(new Product(3, "Google Note", 23000f));
        list.add(new Product(5, "Lenovo VCibe", 76000f));
        list.add(new Product(6, "Redmi X5", 12000f));
        list.add(new Product(7, "Kirgiz", 17000f));

        Stream<Product> filtered_data = list.stream().filter(p->p.price>2000);
        filtered_data.forEach(product -> System.out.println(product.name+": "+product.price));


    }
}