package day_4.employee;

import day_4.employee.Employee;
import day_4.employee.Measurable;

public class MainMeasurable {
    public static void main(String[] args) {
        Employee[] employees = new Employee[8];
		
		employees[0] = new Employee(1, "John", "Kenneth");
		employees[1] = new Employee(2, "Brandon", "Wayne");
		employees[2] = new Employee(3, "Amanda", "Kenneth");
		employees[3] = new Employee(4, "Julia", "Clarence");
		employees[4] = new Employee(5, "Eugene", "Howard");
		employees[5] = new Employee(6, "Jack", "Smith");
		employees[6] = new Employee(7, "Connie", "Amber");
		employees[7] = new Employee(8, "John", "Wick");

        System.out.println("Average: " + Measurable.average(employees));
    }
}