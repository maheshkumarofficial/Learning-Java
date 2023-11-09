/*
 Jo number bas apne aue 1 ke table m hi aayega, wo PRIME NUMBER hain...warna wo composite number hai.
 Example:- [2,3,5,7,11]
 */

 import java.util.*;

 public class primecheck {
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

     }
 } 

/*

  INPUT:- 7
  OUTPUT:- n IS THE prime number
   
  This code snippet determines whether a given number n is a prime number or not. 
  It takes an input from the user, and then checks if n is equal to 2. 
  If it is, it prints "n PRIME NUMBER HAI BHAI". Otherwise, 
  it iterates through the numbers from 2 to n-1 and checks if n is divisible by any of these numbers. 
  If it is, it sets a boolean variable isPrime to false. 
  Finally, it checks the value of isPrime and prints either "n IS THE prime number" or "n IS NOT THE PRIME NUMBER" accordingly.
  
  Flow:
  -----
    Create a Scanner object to read input from the user.
    Read an integer from the user and store it in the variable n.
    Check if n is equal to 2. If true, print "n PRIME NUMBER HAI BHAI".
    If n is not equal to 2, initialize a boolean variable isPrime to true.
    Iterate from i = 2 to n-1.
    Check if n is divisible by i. If true, set isPrime to false.
    Check if isPrime is true. If true, print "n IS THE prime number". 
    Otherwise, print "n IS NOT THE PRIME NUMBER".
  
*/