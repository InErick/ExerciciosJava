package ExerciciosDio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex08 {
    //Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        //Integer não é um tipo primitivo como o int, e o collections só sabe trabalhar com objetos, por isso tive que substituir o int por integer
        //Que transforça o int em um objeto, que é chamado de classe wrapper
        Integer[] numeros = new Integer[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um valor");
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));
    }
}
