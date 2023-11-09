
/* PRINT SUM OF FIRST n NATURAL NUMBERS */

import java.util.*;

public class whileloop5 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc. nextInt();
            int sum = 0;
            int i = 1;
            /* int sum = n * (n + 1) / 2; */

            while(i<=n)
            {
                sum = sum + i;
                i++;
            }

            System.out.println("Sum is " + sum);
        }
    }
}



/*
 The main functionality of the whileloop5 class is to calculate the sum of numbers from 1 to a given input number.

 Methods
 The main method is the main entry point of the program. It takes user input, 
 initializes variables sum and i to 0 and 1 respectively, and then enters a while loop. 
 Inside the while loop, it adds the value of i to sum and increments i by 1. 
 This process continues until i is greater than the input number n. Finally, it prints the calculated sum.
---------------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.util.*;
public class whileloop5 {
    
public static void main(String[] args){
    

     * Calculates the sum of numbers from 1 to a given input number using a while loop.
     * 
     * @param args The command-line arguments.
     
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.
 
nextInt();
            int n = sc.
nextInt();
            int sum = 0;
            int i = 1;
            
            while
(i
<=
n)
            while
 
(i
 
<=
 
n)
 {
                
{
                
sum += i;
                sum = sum + i;
                i++;
            }
            System.out.println("Sum is " + sum);
        }
    }
}

----------------------------------------------------

input: 5

output: 15 how? =[ 1+2+3+4+5= 15]

----------------------------------------------------

 */