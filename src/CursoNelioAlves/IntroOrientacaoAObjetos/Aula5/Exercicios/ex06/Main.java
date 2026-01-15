package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex06;

import java.util.Scanner;
//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor ?");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] resultado = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }
        System.out.println("Vetor resultante: ");
        for (int i = 0; i < vetorA.length; i++) {
            resultado[i] = vetorA[i] +vetorB[i];
            System.out.println(resultado[i]);
        }
    }
}
