package Java02FunctionsAndMethods;

import java.util.Scanner;

public class PrimesInRange1 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is not prime");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            primesinrange(num);
        }
    }

}

/*
    This code snippet defines a method named primesinrange that takes an integer n as input. 
    It iterates from 2 to n and checks if each number is prime by calling the isPrime function. 
    If a number is prime, it prints that the number is prime. Otherwise, it prints that the number is not prime.


    Flow:
    -------
    The program starts by creating a new Scanner object to read input from the user.
    It prompts the user to enter a number.
    The program reads the input number using the nextInt method of the Scanner object and stores it in the num variable.
    The primesinrange method is called with the input number as the argument.
    Inside the primesinrange method, a loop iterates from 2 to the input number.
    For each number in the loop, the isPrime method is called to check if it is prime or not.
    If the number is prime, it is printed with the message "is prime".
    If the number is not prime, it is printed with the message "is not prime".
*/
