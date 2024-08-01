/*
STUDENT NAME:Masike Junior Rasenyalo
STUDENT ID:ST10452404
PROJECT NAME:STUDENT-MANAGEMENT-APPLICATION BETA ROUGH
*/
package smapp;

import java.util.Scanner;

public class SMapp {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentDatabase database = new StudentDatabase();

    public static void main(String[] args) {
        welcomeMessage();
        LaunchWith1();
    }

    public static void welcomeMessage() {
        System.out.println("----------------------------------------------");
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("----------------------------------------------");
        System.out.println("Enter (1) to launch menu or press any button to exit.");
    }

    public static void LaunchWith1() {
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        if (choice == 1) {
            menu();
        } else {
            System.out.println("Exiting application. Goodbye!");
            scanner.close();
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("Please select one of the following menu items:");
        System.out.println("----------------------------------------------");
        System.out.println("(1)  Capture new Student.");
        System.out.println("(2)  Search for a student.  ");
        System.out.println("(3)  Delete a student. ");
        System.out.println("(4)  Print student Report. ");
        System.out.println("(5)  Exit Application. ");
        System.out.println("----------------------------------------------");

        int selection = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        switch (selection) {
            case 1:
                CaptureStudent();
                break;
            case 2:
                searchStudent();
                break;
            case 3:
                // Delete a student
                break;
            case 4:
                // Print student Report
                break;
            case 5:
                System.out.println("Exiting application. Goodbye!");
                scanner.close();
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                menu();
        }
    }

    public static void CaptureStudent() {
        System.out.println("----------------------------------------------");
        System.out.println("Student Registration");
        System.out.println("----------------------------------------------");

        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim(); // trim spaces
        name = capitalize(name); // auto capitalize

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine().trim(); // trim spaces
        surname = capitalize(surname); // auto capitalize

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim(); // trim spaces
        email = email.substring(0, 1).toLowerCase() + email.substring(1); // auto small letter the first letter

        System.out.print("Enter student course: ");
        String course = scanner.nextLine().trim(); // trim spaces

        int studentNumber = (int) (Math.random() * 90000) + 10000; // generate a random 5-digit number

        Student student = new Student(name, surname, age, email, course, studentNumber);
        database.addStudent(student);

        System.out.println("Welcome " + name + " " + surname + " (" + studentNumber + ")");
        System.out.println("press (1) to continue");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        while (true) {
            if (choice == 1) {
                menu();
            } else {
                System.out.println("Exiting application. Goodbye!");
                scanner.close();
                break;
            }
        }
    }

    public static void searchStudent() {
        System.out.print("Enter student number: ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Student student = database.searchStudent(studentNumber);

        if (student != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + student.getName());
            System.out.println("Surname: " + student.getSurname());
            System.out.println("Age: " + student.getAge());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Course: " + student.getCourse());
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("press (1) to continue");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        while (true) {
            if (choice == 1) {
                menu();
            } else {
                System.out.println("Exiting application. Goodbye!");
                scanner.close();
                break;
            }
        }
    }

  // Method to capitalize the first letter of a string
private static String capitalize(String str) {
    if (str == null || str.isEmpty()) {
        return str;
    }
    return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
}}
//serching for student






////////////////////////////////////////////////////////////////////////////////
                                // saving game // 22:24 01/08/2024
////////////////////////////////////////////////////////////////////////////////

// FIX MENU button number 5 .

// make a print report button.

// work on exeptions

// clean up minor errors like,...
//(auto capps and check if user is under 16 or somthing)
