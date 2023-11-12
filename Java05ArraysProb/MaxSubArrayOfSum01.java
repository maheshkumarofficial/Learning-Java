package Java05ArraysProb;

public class MaxSubArrayOfSum01 
{
    public static void MaxSubArrayOfSum(int numbers[])
    {
        int current_sum = 0;

        int max_sum = Integer.MIN_VALUE; // This variable will store the maximum subarray sum found so far. It is initialized to Integer.MIN_VALUE to ensure it can capture the largest possible negative sum                                          
        
        int min_sum = Integer.MAX_VALUE; // This variable will store the minimum subarray sum found so far. It is initialized to Integer.MAX_VALUE to ensure it can capture the smallest possible positive sum                                            

        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            for(int j=i; j<numbers.length; j++)
            {
                int end = j;
                current_sum = 0;
                for(int k=start; k<=end; k++) 
                {
                    //Sum of sub arrays
                    current_sum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println(current_sum);
                if(max_sum < current_sum)
                {
                    max_sum = current_sum;
                }
                if (current_sum < min_sum) {
                    min_sum = current_sum; 
                    
                }
            }
        }
        System.out.println("Maximum Sub-Array sum is = " + max_sum);
        System.out.println("Minimum Sub-Array sum is = " + min_sum);

    }

    public static void main(String [] args)
    {
        //int numbers[] = {22,33,44,55,66,77,88,99};
        //int numbers[] = {2,4,6,8,10};
        //int numbers[] = {1, -3, 2};
        int numbers[] = {1, -2, 6, -1, 3};
        MaxSubArrayOfSum(numbers);

    }
}  



 /*
 * Output:
   -------
    1 = 1
    1 -2 = -1
    1 -2 6 = 5
    1 -2 6 -1 = 4
    1 -2 6 -1 3 = 7

    -2 = -2
    -2 6 = 4
    -2 6 -1 = 3
    -2 6 -1 3 = 6

    6 = 6
    6 -1 = 5
    6 -1 3 = 8

    -1 = -1
    -1 3 = 2

    3 = 3

    Maximum Sub-Array sum is = 8

    Minimum subarray sum is: -2
 */