package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex02;

import java.util.Arrays;
import java.util.Scanner;
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//        - Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar ?");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }
        System.out.println("Valores: "+ Arrays.toString(numeros));
        double sum = 0;
        for(int i =0; i< numeros.length;i++){
            sum += numeros[i];
        }
        System.out.println("Soma: "+ sum);
        System.out.printf("Media: %.2f%n", (sum/numeros.length));

    }
}
