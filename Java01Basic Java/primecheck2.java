import java.util.*;

public class primecheck2 {
    

public static void main(String[] args){
  // Create a scanner object to read user input
  Scanner sc = new Scanner(System.in);
  
  // Read an integer from the user
  int n = sc.nextInt();

  // Check if the number is equal to 2
  if(n == 2)
  {
      System.out.println("n PRIME NUMBER HAI BHAI");
  }
  else{
      // Assume the number is prime
      boolean isPrime = true;
      
      // Check if the number is divisible by any number from 2 to n-1
      for(int i = 2; i<=n-1; i++)
      {
          if(n%i==0)
          {
              // If the number is divisible, it is not prime
              isPrime = false;
          }
      }

      // Print the result based on whether the number is prime or not
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