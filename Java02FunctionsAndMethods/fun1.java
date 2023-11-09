package Java02FunctionsAndMethods;
import java.util.*;
public class fun1 {
    public static void marvel()
    {
        System.out.println("CAPTAIN AMERICA");
        System.out.println("THOR");
        System.out.println("IRONMAN");
        System.out.println("HULK");
        System.out.println("BLACK WIDOW");
        System.out.println("HAWK EYE");
    }

    public static void calculateSum()
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println("Sum is: " + sum);

    }

    public static void main(String[] args)
    {
        marvel();
        calculateSum();


    }

}
