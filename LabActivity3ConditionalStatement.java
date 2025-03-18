import java.util.Scanner;

public class LabActivity3ConditionalStatement.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Age validation
        if (age < 18) {
            System.out.println("Minors are not allowed");
            return;
        } else if (age >= 65) {
            System.out.println("Senior Citizens are not allowed");
            return;
        }

        System.out.print("Enter hours worked: ");
        double dailyHours = scanner.nextDouble();

        // Daily hours validation
        if (dailyHours > 24) {
            System.out.println("Number of hours worked cannot exceed 24 hours");
            return;
        } else if (dailyHours <= 0) {
            System.out.println("Wrong input on daily work hours");
            return;
        }

        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter role code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern): ");
        int jobRoleCode = scanner.nextInt();

        // job role ni User
        String jobRole;
        switch (jobRoleCode) {
            case 1:
                jobRole = "Manager";
                break;
            case 2:
                jobRole = "Supervisor";
                break;
            case 3:
                jobRole = "Staff";
                break;
            case 4:
                jobRole = "Intern";
                break;
            default:
                jobRole = "Undefined";
                break;
        }

        // Salary calculations
        double dailySalary = dailyHours * hourlyWage;
        double weeklySalary = dailySalary * 5; 
        double monthlySalary = dailySalary * 20;
        double yearlySalary = dailySalary * 260;

        // Apply deductions
        double tax = yearlySalary > 250000 ? yearlySalary * 0.32 : 0;
        double governmentBenefits = 1500;
        double netYearlySalary = yearlySalary - tax - governmentBenefits;

        // Calculate years to retirement
        int yearsToRetirement = 65 - age;

        // Display employee details
        System.out.println("\nEmployee Information");
        System.out.println("--------------------");
        System.out.println("Full Name:       " + lastName.toUpperCase() + ", " + firstName.toUpperCase());
        System.out.println("Age:             " + age + " years old");
        System.out.println("Position:        " + jobRole);
        System.out.println("Years to Retirement: " + yearsToRetirement + " years");
        System.out.printf("Daily Salary:    Php %.2f\n", dailySalary);
        System.out.printf("Weekly Salary:   Php %.2f\n", weeklySalary);
        System.out.printf("Monthly Salary:  Php %.2f\n", monthlySalary);
        System.out.printf("Gross Yearly Salary: Php %.2f\n", yearlySalary);
        System.out.printf("Net Yearly Salary:   Php %.2f\n", netYearlySalary);

        scanner.close();
    }
}
