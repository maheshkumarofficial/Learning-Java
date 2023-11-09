import java.util.Scanner;

public class ifelseif2 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
 {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2!=0)
        {
            System.out.println("Weird");
        }
        else if(N >=2&&N<=5)
        {
            System.out.println("Not Weird");
        }
        else if(N>=6 && N <= 20)
        {    
            System.out.println("Weird");
        }
        else if(N>=20)
        {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}


/*


 The code snippet you provided is the same as the previous one. 
 It takes an integer input N from the user and checks if it is weird or not. 
 If N is odd, it prints "Weird". If N is even and between 2 and 5 (inclusive), it prints "Not Weird". 
 If N is even and between 6 and 20 (inclusive), it prints "Weird". 
 If N is even and greater than 20, it prints "Not Weird". 
 The code snippet uses a scanner to read the input and closes it at the end.


 */