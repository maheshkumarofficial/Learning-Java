package Java05ArraysProb;

public class LargestNumberInArrays {
    public static int LargestNumber(int number[])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++)
        {
            if (largest < number[i])
            {
                largest = number[i];
            }
            if(smallest > number[i])
            {
                smallest = number[i];
            }
        }
        System.out.println("The smallest value is:" + " " + smallest);
        return largest;


    }

    public static void main(String[] args)
    {
        int number[] = {1,2,6,3,5,9,8,4};
        System.out.println("The largest value is:" + " " + LargestNumber(number));

    }
}


/*
    (1) The code starts by declaring an array called number that can store 100 integers.
    (2) The code then defines a function called LargestNumber(). 
        This function takes an integer array as input and returns the largest element in the array.
    (3) The LargestNumber() function works by iterating over the number array and 
        comparing each element to the variable largest. 
        If an element in the array is greater than largest, the value of largest is updated.
    (4) The LargestNumber() function then returns the value of largest.
    (5) The code then calls the LargestNumber() function, passing the number array as an argument.
    (6) The code then prints the value returned by the LargestNumber() function.

    
 */