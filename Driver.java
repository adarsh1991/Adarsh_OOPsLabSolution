package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Employee employee = new Employee("Ritwik", "pandey");

        CredentialsGenerator credGenerator = new CredentialsGenerator();

        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        String email;
        char[] password;

        switch (option) {
            case 1:
                email = credGenerator.generateEmail(employee.getFirstName(), employee.getLastName(), "tech");
                password = credGenerator.generatePassword();
                credGenerator.printGeneratedCredentials(employee.getFirstName(), email, password);
                break;
            case 2:
                credGenerator.printGeneratedCredentials(employee.getFirstName(),
                        credGenerator.generateEmail(employee.getFirstName(), employee.getLastName(), "admin"),
                        credGenerator.generatePassword());
                break;
            case 3:
                credGenerator.printGeneratedCredentials(employee.getFirstName(),
                        credGenerator.generateEmail(employee.getFirstName(), employee.getLastName(), "hr"),
                        credGenerator.generatePassword());
                break;
            case 4:
                credGenerator.printGeneratedCredentials(employee.getFirstName(),
                        credGenerator.generateEmail(employee.getFirstName(), employee.getLastName(), "legal"),
                        credGenerator.generatePassword());
                break;
            default:
                System.out.println("Please enter valid department.");
        }
    }
}
