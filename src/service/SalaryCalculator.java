package service;

import model.Employee;

import java.security.PublicKey;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SalaryCalculator {
    private String start;
    private String end;
    private Employee employee;
    Scanner scanner = new Scanner(System.in);
    List<String> weekDays = new ArrayList<String>(List.of
            ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

    public SalaryCalculator(Employee employee) {
        this.employee = employee;
    }

    public double timeCalculation() throws ParseException {
        DateFormat sdf = new SimpleDateFormat("hh:mm");
        double sum = 0;
        for (String weekDay: weekDays) {
            System.out.print("Enter start (" + weekDay + "): ");
            start = scanner.nextLine();
            Date d1 = sdf.parse(start);
            System.out.print("Enter end (" + weekDay + "): ");
            end = scanner.nextLine();
            Date d2 = sdf.parse(end);
            long diff = d2.getTime()- d1.getTime();
            diff /= 60000;
            sum += diff;
        }
        System.out.println(sum/60 + " hours");
        return sum / 60;
    }

    double workedTime;

    {
        try {
            workedTime = timeCalculation();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public double salaryCalculator(){
        System.out.print("Enter the threshold: ");
        int threshold = scanner.nextInt();
        if(threshold>workedTime){
            System.out.println("You haven't reached overtime");
            double salaryPerHr = employee.getSalaryPerHour();
            return salaryPerHr*workedTime;
        }
        double overTime = workedTime - threshold;
        return threshold * employee.getSalaryPerHour() +
                (overTime * (employee.getSalaryPerHour() + employee.getSalaryPerHour())/2);
    }

}
