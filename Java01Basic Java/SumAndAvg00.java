import java.util.*;

public class SumAndAvg00 
{
    
        public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the numbers = a, b, and c:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
        
            int add = a+b+c;
            System.out.println("The sum of a+b+c is = " + add);
        
            int avg = add/3;
            System.out.println("The avg of a+b+c is = " + avg);
        
            scanner.close();
        }
    
}


/*
        Output:
        ------- 
        Enter the numbers = a, b, and c:
        9
        8
        7
        The sum of a+b+c is = 24
        The avg of a+b+c is = 8
 */