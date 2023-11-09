package Java02FunctionsAndMethods;

import java.util.*;

public class fun3parameters 
{

    public static int calculateSUM(int a, int b)
        {
            int sum = a + b;
            return sum;
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = calculateSUM(a, b);

            System.out.println("Sum is: " + sum);

        }
}
