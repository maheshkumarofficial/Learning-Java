import java.util.*;

public class areaofsqure 
{
    public static void main(String[] args)
    {
        int a, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area of a square: ");
        a = scanner.nextInt();
        area = a*a;
        System.out.println("Area of circle: "+ area);

        scanner.close();

    }            
}