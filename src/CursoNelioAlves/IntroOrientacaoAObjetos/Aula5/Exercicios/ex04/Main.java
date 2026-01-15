package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex04;

import java.util.Locale;
import java.util.Scanner;
//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar ?: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int qtdpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                qtdpares++;
            }
        }
        int[] pares = new int[qtdpares];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Quantidade de números pares: "+qtdpares);
    }
}
