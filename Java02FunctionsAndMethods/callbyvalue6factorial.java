package Java02FunctionsAndMethods;

import java.util.Scanner;

// JAVA showcasing uses of call by values
// Importing JAVA input/output classes


// Q. Find the factorial of a number.


//class
public class callbyvalue6factorial {

    //Method to swap numbers
    public static int factorial(int n)
    {
        int f = 1;

        for(int i = 1; i<=n; i++)
        {
            f = f*i;
        }
        return f; // funtion of n

    }

    /*public static void main( String [] args)
    {
    
        //int fact = factorial(4) ;
        //System.out.println("the factorial of given number is = " + fact);
        
        System.out.println("the factorial of given number is = " + factorial(4));
        
        

    }
    ------------------------------------------------------------------------------

    public static void main( String [] args)
    {
        int number = 4;
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number != (int) number) {
            System.out.println("Factorial is not defined for non-integer numbers.");
        } else {
            System.out.println("The factorial of " + number + " is = " + factorial(number));
        }
    }
    ------------------------------------------------------------------------------

    */
    public static void main( String [] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            System.out.println("the factorial of given number is = " + factorial(number));
        }
        
    }
}

/*
    This code snippet defines a method named factorial that calculates the factorial of a given number n. 
    It initializes a variable f to 1 and uses a for loop to iterate from 1 to n, multiplying f by each value of i in the loop. 
    Finally, it returns the value of f.

    The main method is called when the program starts.
    The factorial method is called with the number 4 as an argument.
    Inside the factorial method, a variable f is initialized to 1.
    A loop is executed from 1 to n (4 in this case).
    In each iteration of the loop, the value of f is multiplied by i.
    After the loop, the value of f is returned.
    The result of the factorial method is concatenated with the string "the factorial of given number is = " and printed to the console.

 */