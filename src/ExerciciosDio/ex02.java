package ExerciciosDio;

import java.util.Scanner;

public class ex02 {
    //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número escolhido é par");
        }else{
            System.out.println("O número escolhido é impar");
        }
    }
}
