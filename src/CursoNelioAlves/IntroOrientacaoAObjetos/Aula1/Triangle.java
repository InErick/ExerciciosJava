package CursoNelioAlves.IntroOrientacaoAObjetos.Aula1;

import static java.lang.Math.sqrt;

public class Triangle {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double calcArea(){
        double p = (ladoA+ladoB+ladoC)/2;

        return sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
    }
}
