package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor ? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        int sum = 0;
        boolean temPar = false;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if(vetor[i] % 2 == 0){
                temPar = true;
            }
            sum += vetor[i];
        }
        if(temPar){
            System.out.println("Media dos pares: "+(sum/n));
        }else{
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
