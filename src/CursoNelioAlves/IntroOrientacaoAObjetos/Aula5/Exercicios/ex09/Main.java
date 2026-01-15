package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex09;

import java.util.Locale;
import java.util.Scanner;
//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas ?: ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        String maisVelho = null;
        int maiorIdade = 0;
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            System.out.println("Dados da "+(i+1)+"a pessoa");
            System.out.println("nome: ");
            pessoas[i].setNome(sc.next());
            System.out.println("idade: ");
            pessoas[i].setIdade(sc.nextInt());
            if(pessoas[i].getIdade() > maiorIdade){
                maiorIdade = pessoas[i].getIdade();
                maisVelho = pessoas[i].getNome();
            }
        }
        System.out.println("Pessoa mais velha: "+maisVelho);
    }
}
