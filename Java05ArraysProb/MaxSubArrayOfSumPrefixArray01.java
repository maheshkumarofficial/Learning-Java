package Java05ArraysProb;

public class MaxSubArrayOfSumPrefixArray01 
{
    public static void MaxSubArrayOfSumPrefixArray(int numbers[])
    {
        int current_sum = 0; // This variable will be used to store the sum of the current subarray that we are considering.

        int max_sum = Integer.MIN_VALUE; // This variable will store the maximum subarray sum found so far. It is initialized to Integer.MIN_VALUE to ensure it can capture the largest possible negative sum                                          
        
        int min_sum = Integer.MAX_VALUE; // This variable will store the minimum subarray sum found so far. It is initialized to Integer.MAX_VALUE to ensure it can capture the smallest possible positive sum 
        
        int prefix[] = new int [numbers.length]; // This line declares an array called prefix of size numbers.length. This array will be used to store the prefix sums of the numbers array.

        prefix[0] = numbers[0]; // This line initializes the first element of the prefix array to the first element of the numbers array.

        //calculate the prefix array
        for(int i=1; i<prefix.length; i++)  // This loop calculates the prefix sums of the numbers array and stores them in the prefix array.
        {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            for(int j=i; j<numbers.length; j++)
            {
                int end = j;

                current_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; // start toh 0 se ho raha hai, toh start ki value agar 0 hui toh "prefix[start-1]" = koi negative index toh hota hai nahi, error de dega. so we have made a condition. agar start ki value 0 hui, toh current sum bann jayega = "prefix[end]" or agar nahi hui value 0 toh... aage badho! "current_sum = prefix[end] - prefix[start-1];"
                
                /* This line calculates the sum of the current subarray using the prefix array. 
                If the start index is 0, then the sum of the subarray is simply the prefix sum at the end index. 
                Otherwise, the sum of the subarray is the difference between the prefix sum at the end index and the prefix sum at the start index minus 1.*/
                
                // This code updates the max_sum
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
        MaxSubArrayOfSumPrefixArray(numbers);

    }


}
