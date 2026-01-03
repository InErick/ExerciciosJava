package ExerciciosDio;

import java.util.Scanner;

public class ex14 {
    //14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int A,B,Aux;

        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();

        Aux = A;
        A = B;
        B = Aux;

        System.out.println("O novo valor de A é :"+A);
        System.out.println("O novo valor de B é: "+B);
    }
}
