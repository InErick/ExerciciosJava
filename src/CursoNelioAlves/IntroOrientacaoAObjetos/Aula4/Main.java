package CursoNelioAlves.IntroOrientacaoAObjetos.Aula4;

import CursoNelioAlves.IntroOrientacaoAObjetos.Aula4.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Enter product Data: ");
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        var product = new Product(name, price, quantity);

        System.out.println("Product data: "+product);

        System.out.println("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("Updated data: "+product);
        System.out.println("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("Updated data: "+product);
        System.out.println(product);
    }
}
