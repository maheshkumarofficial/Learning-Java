import java.util.*;

public class ifelseif {
    public static void main(String[] args) {
        int m1, m2, m3, m4, m5, percent ;
        Scanner scn;

        scn = new Scanner(System.in);
        System.out.println(" Marks bol apna?");
        m1 = scn.nextInt();
        m2 = scn.nextInt();
        m3 = scn.nextInt();
        m4 = scn.nextInt();
        m5 = scn.nextInt();

        percent = (m1 + m2 + m3 + m4 + m5)* 100/500;

        if(percent>=60)
        {
            System.out.println("FIRST");
        }
        
        else if (percent>= 50)
        {
            System.out.println("2nd");

        }
        else if (percent>= 40)
        {
            System.out.println("3rd");
        }
        else
        {
            System.out.println("Fail");

        }

 }
}



// This code snippet is a Java program that calculates the percentage marks of a student based on their input.

// It takes in five marks as input and calculates the percentage using the formula (m1 + m2 + m3 + m4 + m5) * 100/500.

// It then uses conditional statements (if, else if, and else) to determine the grade based on the percentage. 
// If the percentage is greater than or equal to 60, it prints "FIRST". 
// If the percentage is between 50 and 59, it prints "2nd". 
// If the percentage is between 40 and 49, it prints "3rd". Otherwise, it prints "Fail".