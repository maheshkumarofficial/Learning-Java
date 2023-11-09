import java.util.*;

public class forloop1{
    public static void main(String [] args){
        float p,r,si;
        int count, n;
        Scanner sc;

        sc = new Scanner(System.in);

        for(count=1; count<=7; count++)
        {
            System.out.println("ENTER THE VALUES OF P, N, & R");

            p = sc.nextFloat();
            r = sc.nextFloat();
            n = sc.nextInt();

            si = p*n*r/100;

            System.out.println("SIMPLE IMTEREST = Rs." + si);
        }
    }
}

/*
 This code calculates the simple interest for a given set of values using a for loop.

 args: an array of strings representing command line arguments

Flow:
-----
Declare variables p, r, si, count, and n of type float and int respectively.
Create a new Scanner object sc to read input from the user.
Start a for loop with count initialized to 1 and incrementing by 1 until it reaches 7.
Inside the loop, prompt the user to enter the values of p, n, and r.
Read the values of p, r, and n from the user using the Scanner object.
Calculate the simple interest using the formula si = p * n * r / 100.
Print the calculated simple interest.
Repeat steps 4-7 for a total of 7 iterations.



 */