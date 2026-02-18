package CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex01;

import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex01.Entities.Department;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex01.Entities.HourContract;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex01.Entities.Worker;
import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex01.Enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        var sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter departament's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker ? ");
        int n = sc.nextInt();

        for( int i = 1 ; i <= n; i++){
            System.out.println("Enter contract #"+i+" data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculade income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartament().getName());
        System.out.println("Income for "+month+"/"+year+": "+String.format("%2.2f",worker.income(month,year)));
    }
}
