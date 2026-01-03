package ExerciciosDio;

import java.util.Scanner;

public class ex10 {
    //10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.println("Qual a primeira nota desse aluno ?: ");
        nota1 = sc.nextDouble();
        System.out.println("Qual a segunda nota desse aluno ?: ");
        nota2 = sc.nextDouble();
        System.out.println("Qual a terceira nota desse aluno ?: ");
        nota3 = sc.nextDouble();

        System.out.println("A média desse aluno foi: "+(nota1+nota2+nota3)/3);
    }
}
