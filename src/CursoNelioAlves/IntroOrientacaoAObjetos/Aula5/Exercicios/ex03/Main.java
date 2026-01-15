package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex03;

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

        double sum = 0;
        int menoresDeDezeseis = 0;

        for(int i =0;i < pessoas.length; i++){
            pessoas[i] = new Pessoa();
            System.out.println("Dados da "+(i+1)+" pessoa");
            System.out.println("Nome: ");
            pessoas[i].setNome(sc.next());
            System.out.println("Idade: ");
            pessoas[i].setIdade(sc.nextInt());
            if(pessoas[i].getIdade() < 16){
                menoresDeDezeseis++;
                pessoas[i].setMaiorDeDezeseis(true);
            }
            System.out.println("Altura: ");
            pessoas[i].setAltura(sc.nextDouble());
            sum += pessoas[i].getAltura();
        }

        System.out.printf("Altura média: %.2f\n",(sum/ pessoas.length));
        System.out.println("Pessoas com menos de 16 anos: "+(100*menoresDeDezeseis/pessoas.length)+"%");

        for(int i =0; i< pessoas.length;i++){
            if(pessoas[i].isMaiorDeDezeseis()){
                System.out.println(pessoas[i].getNome());
            }
        }
    }
}
