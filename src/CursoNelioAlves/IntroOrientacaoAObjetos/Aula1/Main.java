package CursoNelioAlves.IntroOrientacaoAObjetos.Aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
         var triangululoX = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        triangululoX.setLadoA(sc.nextDouble());
        triangululoX.setLadoB(sc.nextDouble());
        triangululoX.setLadoC(sc.nextDouble());

        var triangululoY = new Triangle();
        System.out.println("Enter the measures of triangle Y: ");
        triangululoY.setLadoA(sc.nextDouble());
        triangululoY.setLadoB(sc.nextDouble());
        triangululoY.setLadoC(sc.nextDouble());

        System.out.println("Triangle X area: "+triangululoX.calcArea());
        System.out.println("Triangle Y area: "+triangululoY.calcArea());

        if(triangululoX.calcArea() > triangululoY.calcArea()){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }

    }
}
