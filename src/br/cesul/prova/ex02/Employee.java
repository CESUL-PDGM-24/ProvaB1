package br.cesul.prova.ex02;

public class Employee {

    private final String name;

    private final double salary;

    private final int timeInCompany;

    public Employee(String name, double salary, int timeInCompany) {
        this.name = name;
        this.salary = salary;
        this.timeInCompany = timeInCompany;
    }

    public double getBonus(){
        if (timeInCompany <= 1) {
            return salary * 0.1;
        }

        if (timeInCompany <= 3) {
            return (salary * 0.15) + 500;
        }

        if (timeInCompany <= 7) {
            return (salary * 0.2) + (200 * timeInCompany);
        }

        return (salary * 0.2) + (350 * timeInCompany);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getTimeInCompany() {
        return timeInCompany;
    }
}
