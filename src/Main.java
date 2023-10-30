import model.Employee;
import service.SalaryCalculator;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter salary per hour: ");
        double salary = scanner.nextDouble();

        Employee worker = new Employee(name,surname,salary);
        SalaryCalculator employee = new SalaryCalculator(worker);

        System.out.println("$" + employee.salaryCalculator() + " for this week");
    }
}
