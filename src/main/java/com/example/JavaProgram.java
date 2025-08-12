package com.example;

import java.util.ArrayList;
import java.util.Scanner;  
import java.util.List;

public class JavaProgram {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JavaProgram.class.getName());
// Stub Employees class to resolve type errors
static class Employees {
    private String firstName;
    private String lastName;
    private int employeeId;
    private String department;
    private double dateHired;
    private int salaryLevel;
    private String jobTitleAndAccommodation;

    public Employees(String firstName, String lastName, int employeeId, String department, double dateHired, int salaryLevel, String jobTitleAndAccommodation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.department = department;
        this.dateHired = dateHired;
        this.salaryLevel = salaryLevel;
        this.jobTitleAndAccommodation = jobTitleAndAccommodation;
    }

    @Override
    public String toString() {
        return String.format("Employee[firstName=%s, lastName=%s, employeeId=%d, department=%s, dateHired=%.2f, salaryLevel=%d, jobTitleAndAccommodation=%s]",
                firstName, lastName, employeeId, department, dateHired, salaryLevel, jobTitleAndAccommodation);
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter employee details (firstName lastName employeeId department dateHired salaryLevel jobTitle needsAccommodation). Type 'exit' to finish:");

    List<Employees> employeesList = new ArrayList<>();
    while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] details = input.split(" ");
            if (details.length != 8) {
                logger.warning("Invalid input. Please enter all details.");
            } else {
                String firstName = details[0];
                String lastName = details[1];
                int employeeId = Integer.parseInt(details[2]);
                String department = details[3];
                double dateHired = Double.parseDouble(details[4]);
                int salaryLevel = Integer.parseInt(details[5]);
                String jobTitle = details[6];
                boolean needsAccommodation = Boolean.parseBoolean(details[7]);
                String jobTitleAndAccommodation = jobTitle + ":" + needsAccommodation;

                    Employees employee = new Employees(firstName, lastName, employeeId, department, dateHired, salaryLevel, jobTitleAndAccommodation);
                    employeesList.add(employee);
            }
        }
        // Print all stored employees after input ends
        logger.info("Stored Employees:");
        for (Employees emp : employeesList) {
            if (emp != null && logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(emp.toString());
            }
        }
        scanner.close();
    }
}
