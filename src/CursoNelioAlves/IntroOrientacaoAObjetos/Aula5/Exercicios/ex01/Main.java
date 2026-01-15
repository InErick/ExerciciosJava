package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex01;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar ?");
        int qtdNumeros = sc.nextInt();

        int[] entradas = new int[qtdNumeros];

        for (int i = 0;i<entradas.length;i++){
            System.out.println("Digite um número: ");
            entradas[i] = sc.nextInt();
        }
        System.out.println("Numeros negativos: ");
        for(int i =0; i < entradas.length; i++){
            if(entradas[i]<0){
                System.out.println(entradas[i]);
            }
        }

    }
}
