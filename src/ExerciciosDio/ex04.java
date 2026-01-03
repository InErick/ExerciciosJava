package ExerciciosDio;

import java.util.Scanner;

public class ex04 {
    //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        System.out.println("O seu antecessor é : " +(numero-1));
        System.out.println("O seu sucessor é : " +(numero+1));
        System.out.printf("Em ordem fica assim: %s - %s - %s",(numero-1), numero, (numero+1));


    }
}
