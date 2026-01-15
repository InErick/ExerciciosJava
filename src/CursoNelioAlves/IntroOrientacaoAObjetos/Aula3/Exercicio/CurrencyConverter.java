package CursoNelioAlves.IntroOrientacaoAObjetos.Aula3.Exercicio;

public class CurrencyConverter {

    private final static double IOF = 0.06;

    public static double converter(double dollarExchangeRate, double  desiredQuantity){
        return (dollarExchangeRate*desiredQuantity) + (IOF*(dollarExchangeRate* desiredQuantity));
    }

}
