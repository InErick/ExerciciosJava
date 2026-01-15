package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.Exercicios.ex10;

import java.util.Scanner;
//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).

public class Main {
    public static void main(String[] args) {
        var sc= new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados ?: ");
        int n = sc.nextInt();
        Aluno[] alunos = new Aluno[n];
        sc.nextLine();

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            System.out.println("Digite o nome, primeira e segunda nota do "+(i+1)+"o aluno");
            alunos[i].setNome(sc.nextLine());
            alunos[i].setNota1(sc.nextDouble());
            alunos[i].setNota2(sc.nextDouble());
            sc.nextLine();
        }
        System.out.println("Alunos aprovados");
        for (int i = 0; i < alunos.length; i++) {
            double media = (alunos[i].getNota1() + alunos[i].getNota2())/2;
            if (media >= 6){
                System.out.println(alunos[i].getNome());
            }
        }
    }
}
