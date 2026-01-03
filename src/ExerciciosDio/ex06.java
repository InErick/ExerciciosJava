package ExerciciosDio;

import java.util.Scanner;

public class ex06 {
    //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um valor qualquer: ");
        double valor = scanner.nextDouble();

        System.out.println("O valor "+valor+" com um reajuste de 5% fica: "+(valor+(valor*0.05)));
    }
}
