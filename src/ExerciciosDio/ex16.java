package ExerciciosDio;

import java.util.Scanner;

public class ex16 {
    //16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
    //
    //equilátero, isósceles ou escaleno.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int A,B,C;

        System.out.println("Digite o lado A do triangulo");
        A = sc.nextInt();
        System.out.println("Digite o lado B do triangulo");
        B = sc.nextInt();
        System.out.println("Digite o lado C do triangulo");
        C = sc.nextInt();

        if(A == B && A == C){
            System.out.println("Esse é um triangulo equilatero");
        }else if(A==B || B == C || C==A){
            System.out.println("Esse é um triangulo isóceles");
        }else if(A != B && A != C && C != B)// Eu sei que isso é redundante, não precisava{
            System.out.println("Esse é um triangulo escanelo");
        }
    }

