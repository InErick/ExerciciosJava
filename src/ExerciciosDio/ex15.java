package ExerciciosDio;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ex15 {
    //15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
    //consideração o ano com 365 dias e o mês com 30 dias.

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int ano,anoAtual,idade,meses,dias;

        System.out.println("Em que ano você nasceu ?");
        ano = sc.nextInt();

        Calendar cal = GregorianCalendar.getInstance();
        idade = cal.get(Calendar.YEAR)-ano;
        meses = idade*12;
        dias = meses*30;
        System.out.println("Você tem "+idade+" anos que em meses dariam "+meses+"meses e em dias dariam "+dias+" dias");
    }
}
