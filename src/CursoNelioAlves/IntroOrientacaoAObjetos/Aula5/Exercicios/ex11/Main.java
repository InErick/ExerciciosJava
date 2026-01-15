package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex11;

import java.util.Scanner;
//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas ?");
        int n = sc.nextInt();

        int[] pessoas = new int[n];

        String genero;
        double altura,sum = 0, media, maiorAltura = 0, menorAltura=3;
        int numeroDeHomem = 0,numeroDeMulheres = 0;

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Altura da "+(i+1)+"a pessoa");
            altura=sc.nextDouble();
            System.out.println("Genero da "+(i+1)+"a pesosa");
            genero=sc.next();
            if(altura>maiorAltura){
                maiorAltura = altura;
            }
            if(altura<menorAltura){
                menorAltura=altura;
            }
            if(genero.equals("F")){
                sum += altura;
                numeroDeMulheres++;
            }else{
                numeroDeHomem++;
            }
        }
        media = (sum/numeroDeMulheres);
        System.out.println("Menor altura: "+menorAltura);
        System.out.println("Maior altura: "+maiorAltura);
        System.out.println("Media das alturas das mulheres: "+media);
        System.out.println("Numero de homens: "+numeroDeHomem);
    }
}
