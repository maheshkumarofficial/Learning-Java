import java.util.*;

public class areaofcircle 
{
    public static void main(String[] args)
    {
        int r;
        double pi = 3.14, area;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        r = scn.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle: "+ area);
    }            
}