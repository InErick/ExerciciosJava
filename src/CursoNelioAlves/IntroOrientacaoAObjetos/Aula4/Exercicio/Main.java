package CursoNelioAlves.IntroOrientacaoAObjetos.Aula4.Exercicio;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        Bank account;
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n) ?");
        String initialDeposit = sc.next();

        if(Objects.equals(initialDeposit, "y")){
            System.out.println("Enter initial deposit value: ");
            double initialDepositValue = sc.nextDouble();
            account = new Bank(accountNumber, accountHolder, initialDepositValue);
        }else if(Objects.equals(initialDeposit, "n")){
            account = new Bank(accountNumber, accountHolder);
        }else{
            System.out.println("Opção invalida, tente novamente");
            return;
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.println("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter withdraw value: ");
        account.witchdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);
    }
}
