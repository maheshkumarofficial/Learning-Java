package Java02FunctionsAndMethods;

import java.util.Scanner;


public class OddEven3 {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number to check whether it is even or odd: ");
        int Num = scanner.nextInt();

        if (isEven(Num)) {
            System.out.println(Num + " is a EVEN number.");
        } else {
            System.out.println(Num + " is an ODD number.");
        }

        scanner.close();
    }
    

}

/*
    Enter an number to check whether it is even or odd: 89
    89 is an ODD number.

    Enter an number to check whether it is even or odd: 88
    88 is a EVEN number.
 */