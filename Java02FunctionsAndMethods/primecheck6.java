package Java02FunctionsAndMethods;

import java.util.Scanner;

public class primecheck6 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i<=n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (long i = 2; i<=n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();


        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}


/*
    
    If the given number n is less than or equal to 1, return false as prime numbers are greater than 1.
    Iterate from 2 to n-1 and check if n is divisible by any number in this range.
    If n is divisible by any number, return false as it is not a prime number.
    If n is not divisible by any number, return true as it is a prime number.


    This code works by first creating a Scanner object. The Scanner object is used to read input from the console.

    Next, the code prompts the user to enter a number to check if it is prime. 
    The code then reads the number from the console using the nextInt() method.

    The code then calls the isPrime() method to check if the given number is prime. 
    The isPrime() method is overloaded to accept both int and long values as parameters. 
    This allows us to check if any integer or long value is prime.

    The isPrime() method works by first checking if the given number is less than or equal to 1. 
    If it is, then the number is not prime and the method returns false. 
    Otherwise, the method iterates from 2 to the square root of the given number. 
    If any of the numbers in this range divide the given number evenly, 
    then the number is not prime and the method returns false. 
    Otherwise, the number is prime and the method returns true.

    Finally, the code prints a message to the console indicating whether or not the given number is prime.

    For example, if we run the code above and enter the number 11, the code will print the following output to the console:
    Enter a number to check if it is prime: 8
    8 is not a prime number.

    Enter a number to check if it is prime: 7
    7 is a prime number.

    */
