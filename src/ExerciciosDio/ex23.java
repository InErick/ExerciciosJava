package ExerciciosDio;

import java.util.Scanner;

public class ex23 {
    //21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        double salario, valorHora = 30.50, descontoINSS = 0.10;

        System.out.println("Digite quantas aulas o professor deu esse mes");
        int aulas = sc.nextInt();

        salario = (valorHora*aulas)-((valorHora*aulas)*descontoINSS);
        System.out.println(salario);
    }
}
