package ExerciciosDio;

import java.util.Scanner;

public class ex01 {
    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int A,B,C;

        System.out.println("Digite o valor de A: ");
        A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        B = scanner.nextInt();
        System.out.println("Digite o valor de C: ");
        C = scanner.nextInt();

        System.out.println("A soma entre os valores A("+A+") e B("+B+") é igual a :"+(A+B));

        System.out.println((A+B)>C ? "A soma entre A e B é maior que C":"A soma entre A e B é menor que C");
    }
}
