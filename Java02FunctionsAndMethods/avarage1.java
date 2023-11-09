package Java02FunctionsAndMethods;

import java.util.Scanner;

public class avarage1 {

    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();

        double average = calculateAverage(number1, number2, number3);

        System.out.println("The average of the three numbers is: " + average);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
    
}
