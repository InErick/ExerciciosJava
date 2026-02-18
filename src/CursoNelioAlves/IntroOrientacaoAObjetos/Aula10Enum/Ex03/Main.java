package CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex03;

import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex03.Entities.Client;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex03.Entities.Order;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex03.Entities.OrderItem;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex03.Entities.Product;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex03.Enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        var sc = new Scanner(System.in);

        System.out.println("Enter client data");
        System.out.println("Name: ");
        String clientName = sc.nextLine();
        System.out.println("Email: ");
        String clientEmail = sc.next();
        System.out.println("Birth date (DD/MM/YYYY)");
        Date birth = sdf.parse(sc.next());

        Client client = new Client(clientName, clientEmail,birth);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order ?");
        int n = sc.nextInt();

        for(int i = 1; i <=n;i++){
            System.out.println("Enter #"+i+" item data:");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            Double productPrice = sc.nextDouble();

            Product product = new Product(productName,productPrice);

            System.out.println("Quantity: ");
            int productQuantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(productQuantity,productPrice,product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);
    }
}
