package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex05;

import java.util.Scanner;
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero)
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        double maiorValor = 0;
        int posicaoMaiorValor = 0;

        System.out.println("Quantos numeros você vai digitar ?");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número");
            numeros[i] = sc.nextDouble();

            if(numeros[i] > maiorValor){
                maiorValor = numeros[i];
                posicaoMaiorValor = i;
            }
        }
        System.out.println("Maior valor = "+maiorValor);
        System.out.println("Posição do maior valor = "+posicaoMaiorValor);
    }
}
