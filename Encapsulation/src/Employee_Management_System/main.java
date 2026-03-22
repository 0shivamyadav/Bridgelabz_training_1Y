package Employee_Management_System;

import java.util.*;

public class main {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(1, "Alice", 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee(2, "Bob", 200, 20);

        emp1.assignDepartment("HR");
        emp2.assignDepartment("IT");

        employees.add(emp1);
        employees.add(emp2);


        for (Employee emp : employees) {
            emp.displayDetails();


            if (emp instanceof Department) {
                ((Department) emp).getDepartmentDetails();
            }

            System.out.println("-------------------");
        }
    }
}