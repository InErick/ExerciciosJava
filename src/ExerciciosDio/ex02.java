package ExerciciosDio;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número escolhido é par");
        }else{
            System.out.println("O número escolhido é impar");
        }
    }
}
