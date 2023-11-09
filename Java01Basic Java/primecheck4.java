import java.util.*;

public class primecheck4 {
    


public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();

   if(n == 2)
   {
       System.out.println("n PRIME NUMBER HAI BHAI");
   }
   else{

       boolean isPrime = true;
       for(int i = 2; i<=n-1; i++)
       {
           if(n%i==0)
           {
               isPrime = false;
           }
       }

       if(isPrime == true)
       {
           System.out.println("n IS THE prime number");
       }
       else{
           System.out.println("n IS NOT THE PRIME NUMBER");
       }

   }

   sc.close();
}
}


/*
        This code snippet is a Java program that checks whether a given number n is a prime number or not. 
        It takes input from the user, checks if the input number is equal to 2, and prints a message accordingly. 
        If the input number is not 2, it iterates from 2 to n-1 to check if n is divisible by any number in that range. 
        If n is divisible by any number, it sets a boolean variable isPrime to false. 
        Finally, it prints a message based on the value of isPrime.

        Flow:
        -----
        Create a Scanner object to read input from the user.
        Read an integer n from the user.
        If n is equal to 2, print "n PRIME NUMBER HAI BHAI".
        Otherwise, initialize a boolean variable isPrime to true.
        Iterate from i = 2 to n-1.
        If n is divisible by i, set isPrime to false.
        If isPrime is still true, print "n IS THE prime number". Otherwise, print "n IS NOT THE PRIME NUMBER".
        Close the Scanner object.

        -------------------------------------------------------------------------

        Proposed Change:
        ----------------


        import java.util.Scanner;

        /**
         * Checks if a given number is prime.
         *
         * @param n the number to be checked
         * @return true if the number is prime, false otherwise
        
        public static boolean isPrime(int n) {
            if (n == 2) {
                System.out.println("n PRIME NUMBER HAI BHAI");
                return true;
            } else {
                for (int i = 2; i <= n - 1; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }

                return true;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if (isPrime(n)) {
                System.out.println("n IS THE prime number");
            } else {
                System.out.println("n IS NOT THE PRIME NUMBER");
            }

            sc.close();
        }
        
        I made the code strongly typed by specifying the function arguments and return type.
        I modified the docstring to reflect the types.
        I moved the prime number checking logic to a separate function isPrime() to make the code more modular and reusable.
        I updated the main function to call the isPrime() function and display the appropriate message based on the result.
*/