package ExerciciosDio;

import java.util.Scanner;

public class ex13 {
    // 13 - Faça algoritmo que leia o nome e a idade de uma pesoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Qual o seu nome ?: ");
        String nome = sc.next();
        System.out.println("Qual a sua idade ?: ");
        int idade = sc.nextInt();

        System.out.println(idade >= 18 ? nome+" você é maior de idade":nome+" você é menor de idade");
    }
}

