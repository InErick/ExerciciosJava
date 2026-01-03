package ExerciciosDio;

import java.util.Scanner;

public class ex12 {
    // 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
    // pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
    // Tabela de Código de Condições de Pagamento
    //
    // 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    //
    // 2 - À Vista no cartão de crédito, recebe 10% de desconto
    //
    // 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    //
    // 4 - Parcelado no cartão em três vezes, preço normal do produto mais juros de 10%
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto = sc.next();
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();

        System.out.println("Agora digite o método de pagamento: ");
        System.out.println(" 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto" +
                "\n" +
                " 2 - À Vista no cartão de crédito, recebe 10% de desconto" +
                "\n" +
                " 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros" +
                "\n" +
                " 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int metodoDePagamento = sc.nextInt();

        switch (metodoDePagamento){
            case 1 :
                valor = valor - (valor*0.15);
                System.out.println("Você recebeu um desconto de 15%, o novo valor é de: "+valor+"R$");
                break;
            case 2:
                valor = valor - (valor*0.10);
                System.out.println("Você recebeu um desconto de 10%, o novo valor é de: "+valor+"R$");
                break;
            case 3:
                valor = valor;
                System.out.println("Você não recebeu nenhum desconto, o valor do item é: "+valor+" dividido em 2 vezes é 2x de "+valor/2+"R$");
                break;
            case 4:
                valor = valor + (valor*0.10);
                System.out.println("Você escolheu parcelar em 3 vezes, então o novo valor com juros é: "+valor+" dividido em 2 vezes é 2x de "+String.format("%.2f",valor/3)+"R$");
        }

    }
}

