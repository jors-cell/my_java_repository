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
