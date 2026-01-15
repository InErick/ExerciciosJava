package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("Digite o número de dados: ");
        int qtdDados = sc.nextInt();

        double[] vect = new double[qtdDados];

        for(int i =0; i < qtdDados; i++){
            System.out.println("Digite o peso "+i);
            vect[i] = sc.nextDouble();
        }
        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i];
        }
        System.out.printf("%.2f%n",sum/vect.length);
    }
}
