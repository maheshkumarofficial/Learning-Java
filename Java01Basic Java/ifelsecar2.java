import java.util.*;

public class ifelsecar2 {
    public static void main(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("ADULT: drive the car");
        } 
        else if (age >= 13 && age < 18) {
            System.out.println("TeenAger");
        }
        else {
            System.out.println("Sit in the back side");
        }
    }
}