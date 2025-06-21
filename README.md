# my_java_repository

Employee Information System (LabAct1)
This program is to get the info of employees like name, age, and work, then compute how much their salary is in one day.

import java.util.Scanner;
> We put Scanner here so we can type something when the program runs. It helps us get input from users.

Scanner scanner = new Scanner(System.in);
> This one makes the scanner ready to use. Like, it starts listening to what user type.

System.out.print("Enter your first name: ");
String firstName = scanner.nextLine();
> Program ask what your first name is. Users type it. Then it saves the inside variable called `firstName`.

System.out.print("Enter your last name: ");
String lastName = scanner.nextLine();
> Now it asks your last name. It also gets saved inside `lastName`.

System.out.print("Enter your age: ");
int age = scanner.nextInt();
> This asks how old you are. It must be number only, no letters.

System.out.print("Enter hours worked: ");
double hoursWorked = scanner.nextDouble();
> It asks how many hours you work in one day. It can be a number with points like 5.5 or 6.0.

System.out.print("Enter hourly wage: ");
double hourlyWage = scanner.nextDouble();
> It asks how much you get paid every hour you work. Also a number, like 50.0 or 100.5.

String fullName = firstName + " " + lastName;
> This is the first name and last name with space in the middle, to make a full name.

double dailySalary = hoursWorked * hourlyWage;
> This multiplies how many hours you work with how much you pay per hour. That’s how it gets a daily salary.

> It shows all the answers like:
Full name
Age
Daily salary in peso

EmployeeInformationSystemPart2(LabAct2)
import java.util.Scanner;
This line imports the Scanner class from Java's utility package. It allows the program to receive user input from the keyboard.

public class LabActivity2EmployeeInformationSystemPart2 {
This defines the name of the Java class. It should match the filename when saved (e.g., LabActivity2EmployeeInformationSystemPart2.java).

public static void main(String[] args) {
This is the main method, where the program execution begins.

Scanner scanner = new Scanner(System.in);
Creates a Scanner object named scanner to read input from the user via the keyboard.
The user is asked to enter the following employee details:
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
String is used for names.
int is used for age.
double is used for hours worked and wage to accommodate decimal numbers.

String fullName = lastName.toUpperCase() + ", " + firstName.toUpperCase();
Converts both first and last names to uppercase. Combines them in the format: LASTNAME, FIRSTNAME.
int yearsToRetirement = Math.abs(65 - age);
Assumes retirement age is 65. Uses Math.abs to ensure the result is non-negative (even if the user is older than 65).

int dailySalary = (int) Math.round(hoursWorked * hourlyWage);
Computes daily pay, rounds it, and casts it to an integer.
int weeklySalary = dailySalary * 5;
int monthlySalary = weeklySalary * 4;
int grossYearlySalary = monthlySalary * 12;

double taxDeduction = grossYearlySalary * 0.32;
double netYearlySalary = grossYearlySalary - taxDeduction - 1500;
Applies 32% tax on gross income. Subtracts an additional ₱1,500 deduction (can be assumed as a fixed annual expense or government deduction).

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
Displays results using tab spacing and printf formatting for currency. %,d.00 adds comma separators and two zero decimal points. %,.2f formats floating-point values with comma and two decimal digits.

scanner.close();
Closes the Scanner object to prevent memory leaks.

Laboratory Activity # 3: Java Conditional Statements

The program starts with:
import java.util.Scanner;
This allows the program to read input from the keyboard. Then it begins the main part of the program:
public class LabActivity3ConditionalStatement.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
This sets up the scanner so the user can type in their information. The user is asked to enter their first name and last name:
System.out.print("Enter your first name: ");
String firstName = scanner.nextLine();

System.out.print("Enter your last name: ");
String lastName = scanner.nextLine();
Then, the user enters their age:
System.out.print("Enter your age: ");
int age = scanner.nextInt();
The program checks if the user is old enough to work:
if (age < 18) {
    System.out.println("Minors are not allowed");
    return;
} else if (age >= 65) {
    System.out.println("Senior Citizens are not allowed");
    return;
}
If the age is below 18 or 65 and above, the program stops and shows a message. Next, the user inputs how many hours they work per day:
System.out.print("Enter hours worked: ");
double dailyHours = scanner.nextDouble();
The program checks if the number of hours is valid:
if (dailyHours > 24) {
    System.out.println("Number of hours worked cannot exceed 24 hours");
    return;
} else if (dailyHours <= 0) {
    System.out.println("Wrong input on daily work hours");
    return;
}
If hours are more than 24 or 0 or less, the program stops again. Then, the user inputs their hourly wage:
System.out.print("Enter hourly wage: ");
double hourlyWage = scanner.nextDouble();
And chooses a job role by entering a number:
System.out.print("Enter role code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern): ");
int jobRoleCode = scanner.nextInt();
The program uses a switch statement to match the number with a job title:
String jobRole;
switch (jobRoleCode) {
    case 1: jobRole = "Manager"; break;
    case 2: jobRole = "Supervisor"; break;
    case 3: jobRole = "Staff"; break;
    case 4: jobRole = "Intern"; break;
    default: jobRole = "Undefined"; break;
}
Now, the program calculates the salaries using formulas:
double dailySalary = dailyHours * hourlyWage;
double weeklySalary = dailySalary * 5; 
double monthlySalary = dailySalary * 20;
double yearlySalary = dailySalary * 260;
It checks if the salary is taxable and subtracts tax and government benefits:
double tax = yearlySalary > 250000 ? yearlySalary * 0.32 : 0;
double governmentBenefits = 1500;
double netYearlySalary = yearlySalary - tax - governmentBenefits;
It also calculates how many years are left until the worker retires:
int yearsToRetirement = 65 - age;
Finally, it prints all the employee information like full name, age, job role, salary details, and years to retirement:
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

At the end, the scanner is closed: scanner.close();
