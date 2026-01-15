package CursoNelioAlves.IntroOrientacaoAObjetos.Aula5.exemplo2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos desejado: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o nome do produto do produto "+i);
            String prodNome = sc.next();
            System.out.println("Agora digite o preço do produto "+i);
            double prodPrice = sc.nextDouble();

            vect[i] = new Product(prodNome, prodPrice);
        }
        double sum =0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPreco();
        }
        System.out.printf("Média de preços = %.2f%n", (sum/n));

        System.out.println(Arrays.toString(vect));

    }
}
