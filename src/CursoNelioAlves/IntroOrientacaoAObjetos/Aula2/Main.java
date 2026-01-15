package CursoNelioAlves.IntroOrientacaoAObjetos.Aula2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var product = new Product();

        System.out.println("Enter product Data: ");
        System.out.println("Name: ");
        product.setName(sc.next());
        System.out.println("Price: ");
        product.setPrice(sc.nextDouble());
        System.out.println("Quantity in stock: ");
        product.setQuantity(sc.nextInt());

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
