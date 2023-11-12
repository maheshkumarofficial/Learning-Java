package Java05ArraysProb;

public class SwappingArray1
{
    public static void reverse(int numbers[])
    {
        int First = 0, End = numbers.length-1;
        while (First < End)
        {
            int temp = numbers[End];
            numbers[End] = numbers[First];
            numbers[First] = temp;

            First++;
            End--;
        } 
    }

    public static void main(String[] args) 
    {
        int numbers[] = {2,4,6,8,10};

        //print
        reverse(numbers);
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

/*
   Output: 10 8 6 4 2
   ------------------

------------------------------------------------------------------------------------------------------------

    # The reverse method is called with the numbers array as the input.

    # Two variables, First and End, are initialized to the first and last indices of the array respectively.

    # A while loop is executed as long as First is less than End.

    # Inside the loop, the values at the First and End indices are swapped using a temporary variable.

    # The First index is incremented and the End index is decremented.

    # Once the loop ends, the reversed array is printed using a for loop.

    # Each element of the array is printed with a space in between.

    # Finally, a new line is printed.

------------------------------------------------------------------------------------------------------------

 */