package ExerciciosDio;

import java.util.Random;

public class ex21 {
    //21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
    public static void main(String[] args) {
        var gerador = new Random();

        System.out.println(gerador.nextInt(100));
    }
}
