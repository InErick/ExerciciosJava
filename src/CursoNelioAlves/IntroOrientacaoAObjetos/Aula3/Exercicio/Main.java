package CursoNelioAlves.IntroOrientacaoAObjetos.Aula3.Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("What is the dollar price ?: ");
        double dollarExchangeRate = sc.nextDouble();
        System.out.println("How many dollars will be bought ?: ");
        double desiredQuantity = sc.nextDouble();
        System.out.println("Amount to be paid in reais = "+CurrencyConverter.converter(dollarExchangeRate,desiredQuantity));

    }
}
