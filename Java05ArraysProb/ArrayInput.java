package Java05ArraysProb;

import java.util.Scanner;

public class ArrayInput {

    // Define the percentage() function
    public static int percentage(int marks1, int marks2, int marks3) {
        int totalMarks = marks1 + marks2 + marks3;
        int percentage = totalMarks / 3;
        return percentage;
    }

    public static void main(String[] args) {
        // Declare an array to store the marks
        int[] marks = new int[100];

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the marks
        System.out.println("Enter the marks of physics: ");
        marks[0] = scanner.nextInt();

        System.out.println("Enter the marks of chemistry: ");
        marks[1] = scanner.nextInt();

        System.out.println("Enter the marks of maths: ");
        marks[2] = scanner.nextInt();

        // Print the marks
        System.out.println("Marks of physics: " + marks[0]);
        System.out.println("Marks of chemistry: " + marks[1]);
        System.out.println("Marks of maths: " + marks[2]);

        // Calculate the percentage of the three subjects
        int percentage = percentage(marks[0], marks[1], marks[2]);

        // Print the percentage
        System.out.println("Percentage of 3 subjects = " + percentage + "%");

        System.out.println("Length of my array = marks is: " + marks.length);

        // Close the scanner object
        scanner.close();
    }
}


/*
        Input:
        ------
        Enter the marks of physics: 
        98
        Enter the marks of chemistry: 
        89
        Enter the marks of maths: 
        99

        Output:
        -------
        Marks of physics: 98
        Marks of chemistry: 89
        Marks of maths: 99




        The code starts by declaring an array called marks that can store 100 integers.
        The code then creates a scanner object to read user input.
        The code prompts the user to enter the marks of physics, chemistry, and maths.
        The code stores the marks in the marks array.
        The code then prints the marks of physics, chemistry, and maths.
        Finally, the code closes the scanner object.
        Here is a more detailed explanation of each line of code:

        
        package Java05ArraysProb;
        import java.util.Scanner;
        public class ArrayInput {

        The first line of code declares the package that the class belongs to. 
        The second line of code imports the Scanner class from the java.util package. 
        The third line of code declares a public class called ArrayInput.

        
        public static void main(String[] args) {
        The main() method is the entry point of the program. This is where the program execution begins.

        
        // Declare an array to store the marks

        int[] marks = new int[100];
        This line of code declares an array called marks that can store 100 integers. 
        The new keyword is used to create a new array object. 
        The [] brackets indicate that the variable marks is an array.


        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        This line of code creates a new scanner object to read user input. 
        The System.in stream is used to read input from the console.

        // Prompt the user to enter the marks
        System.out.println("Enter the marks of physics: ");
        marks[0] = scanner.nextInt();

        System.out.println("Enter the marks of chemistry: ");
        marks[1] = scanner.nextInt();

        System.out.println("Enter the marks of maths: ");
        marks[2] = scanner.nextInt();

        These lines of code prompt the user to enter the marks of physics, chemistry, and maths. 
        The scanner.nextInt() method is used to read an integer from the console. The marks are stored in the marks array.

        // Print the marks
        System.out.println("Marks of physics: " + marks[0]);
        System.out.println("Marks of chemistry: " + marks[1]);
        System.out.println("Marks of maths: " + marks[2]);

        These lines of code print the marks of physics, chemistry, and maths.


        // Close the scanner object
                scanner.close();
            }
        }

        This line of code closes the scanner object. It is important to close the scanner object to avoid resource leaks.

        Example:

        If the user enters the following marks:
        ---------------------------------------

        Physics: 90
        Chemistry: 85
        Maths: 95




        The output of the program will be:
        ----------------------------------

        Marks of physics: 90
        Marks of chemistry: 85
        Marks of maths: 95

        */