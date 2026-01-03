package ExerciciosDio;

import java.util.Scanner;

public class ex17 {
    //17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
    //
    //Fórmula: C = (5 * ( F-32) / 9)
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit");
        double temperatura = sc.nextDouble();

        double conversão = (5*(temperatura-32)/9);

        System.out.println("A temperatura convertida de Fahrenheit para celsius é: "+conversão);
    }
}
