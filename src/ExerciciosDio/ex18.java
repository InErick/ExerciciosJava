package ExerciciosDio;

public class ex18 {
    //18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

    public static void main(String[] args) {
        double Francisco = 1.5;
        double Sara = 1.1;
        int anos = 0;
        while(Sara < Francisco){
            Sara += 0.03;
            Francisco += 0.02;
            anos++;
        }
        System.out.println("Para que Sara ultrapasse Francisco serão necessários "+anos+" anos crescendo com a mesma constância");
    }
}
