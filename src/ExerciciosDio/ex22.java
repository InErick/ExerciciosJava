package ExerciciosDio;

import java.util.Scanner;

public class ex22 {
    //22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int A,B;
        System.out.println("Digite o valor A");
        A = sc.nextInt();
        System.out.println("Digite o valor B");
        B = sc.nextInt();

        System.out.println("O quociente da divisão "+A+"/"+B+" é : "+A/B);
        System.out.println("E o resto da divisão é "+A%B);

    }
}
