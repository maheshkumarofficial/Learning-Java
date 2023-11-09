package Java02FunctionsAndMethods;

import java.util.Scanner;


public class PalindromeOrNot1 {

    public static boolean isPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;

        while (n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to check for palindrome: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scanner.close();
    }
    
}


/*
        Flow:
        -----
            Initialize originalNumber with the value of n to store the original number.
            Initialize reversedNumber as 0 to store the reversed number.
            Enter a loop while n is greater than 0.
            Inside the loop, get the last digit of n by taking the modulus of n with 10.
            Multiply reversedNumber by 10 and add the last digit to it.
            Divide n by 10 to remove the last digit.
            Repeat steps 4-6 until all digits of n have been processed.
            Check if the originalNumber is equal to the reversedNumber.
            Return true if they are equal, indicating that the number is a palindrome.
            Otherwise, return false, indicating that the number is not a palindrome.

 */