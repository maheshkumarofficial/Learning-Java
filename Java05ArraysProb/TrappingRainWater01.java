/* 
 * This code calculates the amount of water that can be trapped between bars in a given landscape. 
 * It does so by finding the maximum left and right boundaries for each bar 
 * and then calculating the trapped water based on the minimum of these boundaries.
 */


package Java05ArraysProb;

public class TrappingRainWater01 
{
    public static int TrappingRainWater(int barheight[])
    {
        int n = barheight.length; // This variable will store the length of the input array.

        // calculate max left boundary [LeftMaxBoundary] with the help of Auxiliary Array
        int LeftMaxBoundary[] = new int[n]; // mera jo LeftMaxBoundary hai usko suru[index=0 ---->] se suru karna hai calculate.
        /* This variable will store an auxiliary array that will store the maximum left boundary for each element in the input array */
        
        // Step 2: Calculate the maximum left boundary for each element in the input array:
        LeftMaxBoundary[0]= barheight[0]; // This line initializes the first element of the LeftMaxBoundary array to the first element of the input array.

        for(int i=1; i<n; i++)
        {
            LeftMaxBoundary[i] = Math.max(LeftMaxBoundary[i-1], barheight[i]);
        }
        /* CURRENT BARHIEGHT KO COMPARE KAR LUNGA APNE LEFTMAXBOUNDARY[i-1]; se
         * Matlab abhi tak purane wale element ke paas LeftMaxBoundary jitni thi, usko maine apne current barheight secompare kar liya
         * Dono me se jo bhi zyada hoga , wahi mere current bar ke liye LeftMaxBoundary bann jayega.
          
         * This loop iterates over the input array from left to right. 
         * At each iteration, the loop compares the current element of the input array to the left maximum boundary of the previous element. 
         * The loop then updates the left maximum boundary of the current element to the greater of the two.
            Explanation: This loop calculates the maximum left boundary for each element in the input array. 
            The maximum left boundary for an element is the tallest bar to the left of that element. 
            For example, the maximum left boundary for the element at index 2 is 4, because the tallest bar to the left of that element is 4.
        */

        // Now, calculate max right boundary [RightMaxBoundary] with the help of Auxiliary Array
        int RightMaxBoundary[] = new int[n]; // mera jo RightMaxBoundary hai usko last [index=6 <-----] se suru karna hai calculate.
        /* This variable will store an auxiliary array that will store the maximum right boundary for each element in the input array */
        
        RightMaxBoundary[n-1] = barheight[n-1]; // This line initializes the last element of the RightMaxBoundary array to the last element of the input array.

        for(int i=n-2; i>=0; i--) // int i=n-2; qki n-1 ke liye already calcute ho chuki h RightMaxBoundary
        {
            RightMaxBoundary[i] = Math.max(RightMaxBoundary[i+1], barheight[i]); // Pehle mai i-1 krta tha qki mujhe pichle wale element ko check krna tha, iss baar i+1 kiya hai, qki maine ulta check krna suru kiya hai, array ke pichhe se suru kiya hai, toh usse agle wale element ke sath compare kar lunga RightMaxBoundary ko
        }
        /* 
         * This loop iterates over the input array from right to left. At each iteration, the loop compares the current element of the input array to the right maximum boundary of the next element. The loop then updates the right maximum boundary of the current element to the greater of the two.

            Explanation: This loop calculates the maximum right boundary for each element in the input array. 
            The maximum right boundary for an element is the tallest bar to the right of that element. 
            For example, the maximum right boundary for the element at index 2 is 6, because the tallest bar to the right of that element is 6.
         */

        // Now, Calculate the water level
        int TrappedWater = 0; // This variable will store the total amount of water that can be trapped.
        
        for(int i=0; i<n; i++)
        {
            // water level= min 0f LeftMaxBoundary & RightMaxBoundary
            int WaterLevel = Math.min(LeftMaxBoundary[i], RightMaxBoundary[i]); // right aur left m jo maximum boundary h, unn dono ka minimum boundary jo h wo mere liye water level hai

            // Trapped water += water level - height[i]
            TrappedWater += WaterLevel - barheight[i]; // water level m se barheight ko minus kar du toh mera TrappedWater nikal jayega
        }
        
        return TrappedWater; // Finally, TrappedWater ki value ko maine return kar diya
    }
    
    public static void main(String []args)
    {
        int barheight[] = {4,2,0,6,3,2,5};
        System.out.println("Total Water that can be trapped is:" + " " + (TrappingRainWater(barheight)));
    }
}
