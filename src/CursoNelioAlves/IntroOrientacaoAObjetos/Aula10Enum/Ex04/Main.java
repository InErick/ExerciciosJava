package CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex04;

import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex04.Entities.Client;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex04.Entities.Enums.OrderStatus;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex04.Entities.Order;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex04.Entities.OrderItem;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex04.Entities.Product;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

// Exericio - https://docs.google.com/document/d/1bmWL5ncXrMkCyi1Xl6ZBrGxZTtbmX9rhI9IsOEnf3zw/edit?tab=t.0
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name,email,birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(),status,client);

        System.out.println("How many items to this order ? ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter #"+i+" item data: ");
            System.out.println("product name: ");
            sc.next();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName,productPrice);
            OrderItem orderItem = new OrderItem(productQuantity,productPrice,product);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println(order);

    }
}
