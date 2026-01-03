package ExerciciosDio;

import java.util.Scanner;

public class ex11 {
    // 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
    // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Qual o nome do aluno ?: ");
        String nome = sc.next();

        System.out.println("Digite a primeira nota desse aluno: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota desse aluno: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota desse aluno: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota desse aluno: ");
        nota4 = sc.nextDouble();

        media = (nota1+nota2+nota3+nota4)/4;
        System.out.printf("A média do aluno %s é %s \n",nome,media);
        if(media >= 7){
            System.out.println("A sua situação academica é: Aprovado");
        }else{
            System.out.println("A sua situação academica é: Reprovado");
        }
    }
}
