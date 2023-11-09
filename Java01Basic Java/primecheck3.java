import java.util.*;

public class primecheck3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==2)
        {
           System.out.println("n IS PRIME NUMBER"); 
        }
        else{

            boolean isPrime = true;
            for(int i=2; i<= Math.sqrt(n); i++)
            {
                if(n%i==0)
                {
                    isPrime = false;
                }

            }

            if(isPrime == true)
            {
                System.out.println("n IS THE PRIME NUMBER");
            }
            else{
                System.out.println("n IS NOT THE PRIME NUMBER");
            }
        }
    }
}   



/*
       This code snippet checks whether a given number n is a prime number. 
       It takes input from the user, checks if the number is equal to 2 (which is a prime number), 
       and if not, it iterates from 2 to the square root of n and checks if n is divisible by any number in that range. 
       If n is divisible by any number, it sets a flag isPrime to false. 
       Finally, it checks the value of isPrime and prints whether n is a prime number or not. 


       Flow:
       -----
        Create a Scanner object to read input from the user.
        Read an integer n from the user.
        If n is equal to 2, print "n IS PRIME NUMBER".
        Otherwise, set a boolean variable isPrime to true.
        Iterate from i = 2 to the square root of n.
        If n is divisible by i, set isPrime to false.
        If isPrime is still true after the loop, print "n IS THE PRIME NUMBER".
        Otherwise, print "n IS NOT THE PRIME NUMBER".

*/