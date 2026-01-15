package CursoNelioAlves.IntroOrientacaoAObjetos.Aula3;

import java.util.Locale;
import java.util.Scanner;

import static CursoNelioAlves.IntroOrientacaoAObjetos.Aula3.Calculadora.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circunference(radius);
        double v = volume(radius);

        System.out.printf("Circunference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f%n", PI);

    }
}
