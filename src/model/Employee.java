package model;

public class Employee {
    private String name;
    private String surname;
    private double salaryPerHour;

    public Employee(String name, String surname, double salaryPerHour) {
        this.name = name;
        this.surname = surname;
        this.salaryPerHour = salaryPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
