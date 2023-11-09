package Java02FunctionsAndMethods;


public class ComputeTheSumOfDigits 
{

    public static int sumOfDigits(int number) 
    {
        int sum = 0;

        // Iterate until the number becomes 0
        while (number != 0) {
            // Find the last digit of the number
            int lastDigit = number % 10;
            
            // Add the last digit to the sum
            sum += lastDigit;

            // Remove the last digit from the number
            number = number / 10;
        }

        return sum;
    }


    public static void main(String[] args) 
    {
        int inputNumber = 12345;
        int result = sumOfDigits(inputNumber);
        System.out.println("Sum of digits in " + inputNumber + " is: " + result);

    }
    
    
}

/*
        Step-by-Step Explanation:
        -------------------------

        The method sumOfDigits takes an integer number as its argument and computes the sum of its digits.

        We initialize a variable sum to store the sum of digits. This variable starts at 0.

        We enter a while loop that continues until number becomes 0.

        Inside the loop:

                * We find the last digit of the number by using the modulo operator %. This operation extracts the last digit.
                * We add the last digit to the sum.

        After adding the last digit to the sum, we remove the last digit from the number by dividing it by 10.

        The loop continues this process until all digits have been processed.

        Finally, the method returns the sum, which is the sum of all the digits in the input number.

        In the main method, we demonstrate the use of the sumOfDigits method by providing an example input number, calculating the sum of its digits, and printing the result.

        When you run the code with inputNumber = 12345, it will calculate the sum of digits (1 + 2 + 3 + 4 + 5) and print "Sum of digits in 12345 is: 15."




        The code you provided is a Java class called DigitSum with a static method called sumOfDigits(). This method takes an integer as input and returns the sum of its digits.

            #Step-by-step explanation of the code:
            --------------------------------------

            The method first declares a variable called sum and initializes it to 0. This variable will be used to store the sum of the digits of the input number.
            The method then enters a while loop that will iterate until the input number becomes 0.
            Inside the while loop, the method first finds the last digit of the input number by using the modulo operator (%). The modulo operator returns the remainder of a division operation. In this case, we are dividing the input number by 10. The remainder will be the last digit of the number.
            The method then adds the last digit to the sum variable.
            Finally, the method removes the last digit from the input number by dividing it by 10.


            Example:
            --------
            Input number: 12345

            Step 1: sum = 0
            Step 2: while (number != 0)
            Step 3: lastDigit = number % 10 = 5
            Step 4: sum += lastDigit = 5
            Step 5: number = number / 10 = 1234
            Step 2: while (number != 0)
            Step 3: lastDigit = number % 10 = 4
            Step 4: sum += lastDigit = 9
            Step 5: number = number / 10 = 123
            Step 2: while (number != 0)
            Step 3: lastDigit = number % 10 = 3
            Step 4: sum += lastDigit = 12
            Step 5: number = number / 10 = 12
            Step 2: while (number != 0)
            Step 3: lastDigit = number % 10 = 2
            Step 4: sum += lastDigit = 14
            Step 5: number = number / 10 = 1
            Step 2: while (number != 0)
            Step 3: lastDigit = number % 10 = 1
            Step 4: sum += lastDigit = 15
            Step 5: number = number / 10 = 0

            Return sum = 15

            Output:
            --------
            Sum of digits in 12345 is: 15
*/