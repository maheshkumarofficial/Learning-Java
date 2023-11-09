package Java02FunctionsAndMethods;

import java.util.*;

public class fun2parameters 
{

    public static void calculateSUM(int a, int b)
        {
            int sum = a + b;
            System.out.println("THE SUM IS: " + sum);
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            calculateSUM(a,b);

        }
}

/*
 This code defines a method called calculateSUM that takes two integer "parameters" a and b. 
 It calculates the sum of a and b, stores it in a variable called sum, and then prints out the sum to the console.
 */
