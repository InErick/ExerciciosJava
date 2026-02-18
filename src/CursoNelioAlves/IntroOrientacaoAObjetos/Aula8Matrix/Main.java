package CursoNelioAlves.IntroOrientacaoAObjetos.Aula8Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal");
        for(int i = 0; i<n;i++){
            System.out.print(mat[i][i]+" ");
        }
        System.out.println();
        int negativeNumbers = 0;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                if(mat[i][j] < 0){
                    negativeNumbers++;
                }
            }
        }
        System.out.println("Negative numbers: "+negativeNumbers);
    }
}
