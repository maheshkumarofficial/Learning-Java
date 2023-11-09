package Java02FunctionsAndMethods;

import java.util.Scanner;

// Q. Find the "binomial co-efficient" of a number.

public class callbyvalue7binomialcoefficient {

    public static int factorial(int n)
    {
        int f = 1;

        for(int i = 1; i<=n; i++)
        {
            f = f*i;
        }
        return f; // funtion of n

    }

    public static int binocoefficient(int n, int r)
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binocoefficient = fact_n/(fact_r * fact_nmr);

        return binocoefficient;
    }

    

    public static void main( String [] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a n value: ");
            int n_value = scanner.nextInt();

            System.out.println("Enter a r value: ");
            int r_value = scanner.nextInt();
            
            System.out.println("the value of binomial co-efficient of the given number is = " + binocoefficient(n_value, r_value));
        }

        System.out.println("the value of 2nd binomial co-efficient is = " + binocoefficient(5, 2));

        
    }


    
}


/*
    This code calculates the binomial coefficient, 
    which represents the number of ways to choose "r" items from a set of "n" items. 
    It uses a factorial function to compute the factorials of "n", "r", and "n-r", 
    and then divides the factorial of "n" by the product of the factorials of "r" and "n-r". 
    The result is returned as the binomial coefficient.


 */
