package ExerciciosDio;

import java.util.Scanner;

public class ex03 {
    //3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
    //caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int A,B,C;

        System.out.println("Digite o valor de A: ");
        A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        B = scanner.nextInt();

        if(A == B){
            C = A+B;
            System.out.println("A e B são iguais, então devemos fazer a soma");
            System.out.printf("%s + %s é igual a %s",A,B,C);
        }else{
            C = A*B;
            System.out.println("A e B são diferentes, então devemos fazer a multiplicação");
            System.out.printf("%s + %s é igual a %s",A,B,C);
        }
    }
}
