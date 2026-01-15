package CursoNelioAlves.IntroOrientacaoAObjetos.Aula4.Exercicio;

public class Bank {
    private final int accountNumber;
    private final String accountHolder;
    private double accountBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double value){
        this.accountBalance += value;
    }

    public void witchdraw(double value){

        this.accountBalance -= value+5;
    }

    public Bank(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public Bank(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = 0;
    }

    @Override
    public String toString() {
        return "Account "+accountNumber+", " +
                "Holder: "+accountHolder+", " +
                "Balance: $"+ accountBalance;
    }
}
