package CursoNelioAlves.IntroOrientacaoAObjetos.Aula7List.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.println("How many employess will be registered ?");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #"+i);

            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            employeeList.add(new Employee(id,name,salary));
        }
        System.out.println("Enther the employer id that will have salary increase: ");
        int idEmployer = sc.nextInt();
        Employee x = employeeList.stream().filter(employee -> employee.getId() == idEmployer).findFirst().orElse(null);
        if(x != null){
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            x.increasedSalary(percentage);
        }else{
            System.out.println("This id does not exist!");
        }
        for (Employee employee : employeeList){
            System.out.println(employee);
        }

    }
}
