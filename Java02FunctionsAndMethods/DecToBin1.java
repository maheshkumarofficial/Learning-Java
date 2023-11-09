package Java02FunctionsAndMethods;

import java.util.Scanner;

public class DecToBin1 {

    public static void DecToBin(int n)
    {
        int MyNum = n;
        int pow = 0;
        int BinNum = 0;

        while(n > 0)
        {
            int rem = n % 2; //  Har no. ko 2 se divide kar ke remainder nikalne ka tarika.

            BinNum = BinNum + (rem * (int)Math.pow(10, pow));

            pow++;

            n = n / 2;
        }

        System.out.println("Binary form of given Decimal Number " + MyNum + " is:  " + BinNum);
    }
    

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a DECIMAL Number: ");
            int num = scanner.nextInt();
            DecToBin(num);
        }
    }

    
}




/*
        Flow:
        -------
        Initialize variables MyNum, pow, and BinNum to store the decimal number, power, and binary number respectively.
        Enter a while loop that continues until n is greater than 0.
        Calculate the remainder of n divided by 2 and store it in rem.
        Update BinNum by adding the product of rem and 10 raised to the power of pow.
        Increment pow by 1.
        Update n by dividing it by 2.
        Repeat steps 3-6 until n becomes 0.
        Print the binary form of the given decimal number.



        Certainly, let's break down the line of code `BinNum = BinNum + (rem * (int) Math.pow(10, pow));` and explain its step-by-step execution and process:

        BinNum: This is a variable that stores the binary representation of the decimal number.

        rem: This variable represents the remainder when the decimal number is divided by 2. It can be either 0 or 1, corresponding to binary digits.

        Math.pow(10, pow): This part of the code calculates 10 raised to the power of pow. It's used to position the binary digit correctly within the binary representation.

        (rem * (int) Math.pow(10, pow)): This part of the code combines the remainder rem and the position calculated using Math.pow(10, pow). It effectively converts the remainder to a binary digit and places it in the correct position within the binary representation.

        BinNum = BinNum + (rem * (int) Math.pow(10, pow));: This line of code updates the BinNum variable by adding the binary digit (0 or 1) to it. It accumulates the binary digits as the loop iterates through the decimal number, effectively building the binary representation digit by digit.

        Here's a step-by-step example to illustrate how this code works:

        Suppose we want to convert the decimal number 12 to binary. The loop iterates as follows:

        Initial values: BinNum = 0, pow = 0, n = 12.
        First iteration:

        rem is calculated: rem = 12 % 2 = 0.
        Math.pow(10, pow) is calculated: Math.pow(10, 0) = 1.
        rem * (int) Math.pow(10, pow) is 0, indicating a binary digit of 0.
        BinNum is updated: BinNum = BinNum + 0 = 0.
        pow is incremented: pow = 1.
        n is updated: n = n / 2 = 12 / 2 = 6.
        Second iteration:

        rem is calculated: rem = 6 % 2 = 0.
        Math.pow(10, pow) is calculated: Math.pow(10, 1) = 10.
        rem * (int) Math.pow(10, pow) is 0, indicating a binary digit of 0.
        BinNum is updated: BinNum = BinNum + 0 = 0.
        pow is incremented: pow = 2.
        n is updated: n = n / 2 = 6 / 2 = 3.
        Third iteration:

        rem is calculated: rem = 3 % 2 = 1.
        Math.pow(10, pow) is calculated: Math.pow(10, 2) = 100.
        rem * (int) Math.pow(10, pow) is 100, indicating a binary digit of 1.
        BinNum is updated: BinNum = BinNum + 100 = 100.
        pow is incremented: pow = 3.
        n is updated: n = n / 2 = 3 / 2 = 1.
        Fourth iteration:

        rem is calculated: rem = 1 % 2 = 1.
        Math.pow(10, pow) is calculated: Math.pow(10, 3) = 1000.
        rem * (int) Math.pow(10, pow) is 1000, indicating a binary digit of 1.
        BinNum is updated: BinNum = BinNum + 1000 = 1100.
        pow is incremented: pow = 4.
        n is updated: n = n / 2 = 1 / 2 = 0.
        The loop ends because n becomes 0.

        After all iterations, BinNum holds the binary representation of the decimal number 12, which is 1100.

*/        