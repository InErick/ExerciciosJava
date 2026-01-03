package ExerciciosDio;

import java.util.Scanner;

public class ex20 {
    //20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Digite um número para receber a sua tabuada");
        int numero = sc.nextInt();

        for(int i = 1;i <= 10;i++){
            System.out.println(i+"x"+numero+" = "+numero*i);
        }
    }
}
