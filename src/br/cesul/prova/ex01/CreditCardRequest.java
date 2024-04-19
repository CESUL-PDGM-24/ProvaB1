package br.cesul.prova.ex01;

public class CreditCardRequest {

    private String name;

    private String email;

    private double salary;

    private int dependents;

    public CreditCardRequest(String name, String email, double salary, int dependents) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.dependents = dependents;
    }

    public double getLimit() {
        double limit = salary * 2;

        if (dependents > 1 && dependents <= 3) {
            return limit * 0.85;
        } else if (dependents > 3) {
            return limit * 0.75;
        }

        return limit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public int getDependents() {
        return dependents;
    }
}
