import java.util.Scanner;

public class LabActivity2EmployeeInformationSystemPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter hours worked in a day: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        // Compute
        String fullName = lastName.toUpperCase() + ", " + firstName.toUpperCase();
        int yearsToRetirement = Math.abs(65 - age);
        int dailySalary = (int) Math.round(hoursWorked * hourlyWage);
        int weeklySalary = dailySalary * 5;
        int monthlySalary = weeklySalary * 4;
        int grossYearlySalary = monthlySalary * 12;
        double taxDeduction = grossYearlySalary * 0.32;
        double netYearlySalary = grossYearlySalary - taxDeduction - 1500;

        // Output
        System.out.println("\nEmployee Information");
        System.out.println("----------------------");
        System.out.println("Full Name:\t\t\t\t\t" + fullName);
        System.out.println("Age:\t\t\t\t\t\t" + age + " years old");
        System.out.println("Years to Retirement:\t\t" + yearsToRetirement + " years");
        System.out.printf("Daily Salary:\t\t\t\tPhp %,d.00%n", dailySalary);
        System.out.printf("Weekly Salary:\t\t\t\tPhp %,d.00%n", weeklySalary);
        System.out.printf("Monthly Salary:\t\t\t\tPhp %,d.00%n", monthlySalary);
        System.out.printf("Gross Yearly Salary:\t\tPhp %,d.00%n", grossYearlySalary);
        System.out.printf("Net Yearly Salary:\t\t\tPhp %,.2f%n", netYearlySalary);

        scanner.close();
    }
}
