import java.util.Scanner;

public class EmployeeInfoSystem {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Prompt user for their details
        System.out.print("Enter your first name: ");
        
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        // Compute full name
        String fullName = firstName + " " + lastName;
        // Compute daily sahod
        double dailySalary = hoursWorked * hourlyWage;

        // Display output
        System.out.println("\nEmployee Information:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Daily Salary: PHP" + dailySalary);

        // Close scanner
        scanner.close();
    }
}
