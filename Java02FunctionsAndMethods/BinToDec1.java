package Java02FunctionsAndMethods;

import java.util.Scanner;

public class BinToDec1 {

    public static void BinToDec(int BinNum)
    {
        int MyNum = BinNum;
        int pow = 0;
        int DecNum= 0;

        while(BinNum > 0)
        {
            int LastDigit = BinNum % 10; // Last number nikalne ka tarika = usko 10 se divide kr do

            DecNum = DecNum + (LastDigit * (int)Math.pow(2, pow));

            pow++;

            BinNum = BinNum / 10;
        }

        System.out.println("Decimal of Binary Number " + MyNum + " = " + DecNum);
    }
    

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a binary number: ");
            int num = scanner.nextInt();
            BinToDec(num);
        }
    }

    
}




/*
    Import Statements:
    -----------------------

    import java.util.Scanner;

    This code begins by importing the Scanner class, which allows the user to input values from the console.


    Method BinToDec Definition:
    ---------------------------


    
    public static void BinToDec(int BinNum) {
        // Method code here
    }


    This defines a method named BinToDec which takes an integer BinNum as a parameter. 
    This method is used to convert a binary number to its decimal equivalent.



    Variable Declarations:
    -----------------------

    int pow = 0;
    int DecNum = 0;

    Inside the BinToDec method, two integer variables are declared. 
    pow is used to keep track of the position of the binary digit being processed, 
    and DecNum will store the final decimal result.

    While Loop:
    -----------------------

    while (BinNum > 0) {
        // Loop code here
    }

    This while loop runs as long as the BinNum is greater than zero, which means there are still binary digits to process.



    Extracting the Last Digit:
    --------------------------

    int LastDigit = BinNum % 10;

    In each iteration of the loop, the last digit of BinNum is extracted using the modulo operator %.


    Decimal Conversion:
    -------------------

    DecNum = DecNum + (LastDigit * (int)Math.pow(2, pow));

    The last binary digit (LastDigit) is converted to its decimal equivalent and added to DecNum. 
    This is done by multiplying the digit by 2 raised to the power of its position, which is pow.

    Incrementing the Position:
    --------------------------

    pow++;

    The pow variable is incremented to keep track of the position of the next binary digit to be processed.



    Removing Processed Digit:
    -----------------------
    BinNum = BinNum / 10;

    The last digit is removed from BinNum by dividing it by 10, 
    effectively shifting the digits to the right for the next iteration.


    Printing the Result:
    -----------------------

    System.out.println("Decimal of Binary Number" + BinNum + " = " + DecNum);

    After the loop completes, the code prints the converted decimal number, along with a message.


    main Method:
    ------------

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input and method call
        }
    }


    In the main method, a Scanner object is created to receive user input. 
    The user is prompted to enter a binary number, and the BinToDec method is called with the entered value.

    Overall, this code reads a binary number, processes its digits one by one, converts it to decimal, 
    and then prints the decimal equivalent.


    */
