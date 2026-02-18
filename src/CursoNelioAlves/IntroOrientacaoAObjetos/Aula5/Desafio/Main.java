package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Desafio;

import CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Desafio.entities.Rent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #"+i+": ");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();
            rooms[roomNumber] = new Rent(name, email);
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Busy rooms");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null){
                System.out.println(i+": "+rooms[i]);
            }
        }

    }
}
