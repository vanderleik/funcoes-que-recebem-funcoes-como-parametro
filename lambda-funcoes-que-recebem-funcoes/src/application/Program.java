package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();
        double sumT = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double sumMenorCem = ps.filteredSum(list, p -> p.getPrice() <= 100.0);

        System.out.println("Soma dos elementos que começam com a letra T = " + String.format("%.2f", sumT));
        System.out.println("Soma dos elementos cujo preço é menor que 100.0 = " + String.format("%.2f", sumMenorCem));
    }
}
