package day4.employee;

public class Employee implements Measurable {

    private double salary;
    private String name;
    private String surname;
    private int ID;

    private Employee(int ID, String name, String surname, double salary) {
        this.salary = salary;
        this.name = name;
        this.ID = ID;
        this.surname = surname;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}