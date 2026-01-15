package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex07;

import java.util.Scanner;
//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor ? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        double sum = 0;
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Digite um número: ");
            numeros[i]= sc.nextDouble();
            sum += numeros[i];
        }
        double media = sum/n;
        System.out.println("A média do vetor : "+ media);
        System.out.println("Elementos a baixo da media");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < media){
                System.out.println(numeros[i]);
            }
        }
    }
}
