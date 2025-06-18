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