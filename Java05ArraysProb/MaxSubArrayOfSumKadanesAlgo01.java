package Java05ArraysProb;

public class MaxSubArrayOfSumKadanesAlgo01 
{
    public static void kadanes(int numbers[])
    {
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE; // // ye wala tbb use karne ka jb minimum no. v chaiye
        int current_sum = 0; 
        /* These lines declare three variables: max_sum, min_sum, and current_sum. 
        The max_sum variable will store the maximum subarray sum found so far. 
        The min_sum variable will store the minimum subarray sum found so far. 
        The current_sum variable will store the sum of the current subarray that we are considering.*/

        for(int i=0; i<numbers.length; i++)
        {
            current_sum = current_sum + numbers[i]; // This line adds the current element of the numbers array to the current_sum variable.
            if (current_sum > max_sum) // This code checks if the current_sum is greater than the max_sum variable. If it is, then the max_sum variable is updated to the current_sum variable.
            {
                max_sum = current_sum; // ye wala tbb use karne ka jb minimum no. v chaiye
            }

            // If current sum becomes negative, reset it to 0. 
            //This code checks if the current_sum is negative. If it is, then the current_sum variable is reset to 0.
            if (current_sum < 0) 
            {
                current_sum = 0;
            }

            // Update minimum subarray sum
            // This code checks if the current_sum is smaller than the min_sum variable. If it is, then the min_sum variable is updated to the current_sum variable.
            if (current_sum < min_sum) 
            {
                min_sum = current_sum; //// ye wala tbb use karne ka jb minimum no. v chaiye
            }

            max_sum = Math.max(current_sum, max_sum); // These lines ensure that the max_sum and min_sum variables always contain the maximum and minimum subarray sums found so far, respectively.


            min_sum = Math.min(current_sum, min_sum); // // ye wala tbb use karne ka jb minimum no. v chaiye

        }
        System.out.println("Maximum Sub-Array sum is = " + max_sum);
        System.out.println("Minimum Sub-Array sum is = " + min_sum); //// ye wala tbb use karne ka jb minimum no. v chaiye
    }

    public static void main(String args[])
    {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}


/*
Output:
-------
Maximum Sub-Array sum is = 7
Minimum Sub-Array sum is = 0
*/
