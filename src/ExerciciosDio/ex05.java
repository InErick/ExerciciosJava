package ExerciciosDio;

import java.util.Scanner;

public class ex05 {
    //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario, salarioMinimo = 1621.00;

        System.out.println("Digite o seu salário");
        salario = scanner.nextDouble();

        System.out.printf("Você ganha %.2f salarios minimos",(salario/salarioMinimo));


    }
}
