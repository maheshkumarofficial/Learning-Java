import java.util.Scanner;

public class whileloop1 {
    public static void main(String [] args)
    {
        float p, r, si;
        int n, count;
        Scanner scn;
        count= 1;
        scn = new Scanner(System.in);
        while(count<=3)
        {
            System.out.println("ENTER THE VALUES OF P,N,R");

            p = scn. nextFloat();
            n = scn. nextInt();
            r = scn. nextFloat();

            si = p*n*r/100;

            System.out.println("SIMPLE INTEREST = Rs."+ si);

            count++;
        }
    }
}

/*

This code snippet represents a Java program that calculates the simple interest for three sets of values. 
It uses a while loop to repeat the calculation three times. 
Inside the loop, it prompts the user to enter values for principal (P), number of years (N), and interest rate (R). 
It then calculates the simple interest using the formula SI = (P * N * R) / 100 and prints the result to the console.

--------------------------
        OUTPUT:
--------------------------

ENTER THE VALUES OF P,N,R
8
3
8.9
SIMPLE INTEREST = Rs.2.136
ENTER THE VALUES OF P,N,R
1
2
3
SIMPLE INTEREST = Rs.0.06
ENTER THE VALUES OF P,N,R
2
3
4
SIMPLE INTEREST = Rs.0.24
--------------------------
 */