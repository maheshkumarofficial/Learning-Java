package Java02FunctionsAndMethods;

public class primecheck5 {

    public static boolean isprime(int n)
    {
        boolean isprime = true;

        for(int i = 2; i<=n-1; i++)
        {
            if(n%i==0)
            {
                isprime = false;
                break;
            }
        }

        return isprime;
    }

    public static void main(String[] args)
    {
        System.out.println(isprime(7));
    }
    
}


/*
    Java02FunctionsAndMethods.primecheck5 
    false
    
    This code snippet defines a function named isprime that takes an integer n as input 
    and returns a boolean value indicating whether n is a prime number or not. 
    It checks if n is divisible by any number from 2 to n-1. 
    If it finds a divisor, it sets the isprime variable to false and breaks out of the loop. 
    If no divisor is found, the isprime variable remains true and the function returns true.

    Initialize a boolean variable isprime to true.
    Iterate from i = 2 to n-1.
    Check if n is divisible by i using the modulo operator %.
    If n is divisible by i, set isprime to false and break out of the loop.
    Return the value of isprime.

 */
