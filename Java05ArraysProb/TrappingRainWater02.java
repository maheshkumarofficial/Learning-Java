package Java05ArraysProb;

public class TrappingRainWater02 
{
    public static int trap(int[] height) {
    if (height.length <= 2) 
    {
      return 0;
    }

    int water = 0; //water: This variable will store the total amount of water that can be trapped.
    int maxLeft = 0; //maxLeft: This variable will store the index of the tallest bar to the left of the current bar.
    int maxRight = height.length - 1; //maxRight: This variable will store the index of the tallest bar to the right of the current bar.
    int max = 0; //max: This variable will store the index of the tallest bar in the array.


    for (int i = 0; i < height.length; i++) //This loop iterates over the input array and keeps track of the index of the tallest bar.
    { 
      if (height[i] > height[max]) {
        max = i;
      }
    }

    for (int i = 1; i <= max; i++) /* This loop iterates over the input array from left to right, starting from the index of the tallest bar. At each iteration, the loop checks if the current bar is shorter than the tallest bar to the left. If it is, then the amount of water that can be trapped between the two bars is calculated and added to the total amount of water that can be trapped. The maxLeft variable is also updated to the index of the current bar.*/
    {      
      if (height[i] < height[maxLeft]) {
        water += height[maxLeft] - height[i];
      } else {
        maxLeft = i;
      }
    }

    for (int i = height.length - 2; i > max; i--) /* This loop iterates over the input array from right to left, ending at the index of the tallest bar. At each iteration, the loop checks if the current bar is shorter than the tallest bar to the right. If it is, then the amount of water that can be trapped between the two bars is calculated and added to the total amount of water that can be trapped. The maxRight variable is also updated to the index of the current bar.*/
    {
      if (height[i] < height[maxRight]) {
        water += height[maxRight] - height[i];
      } else {
        maxRight = i;
      }
    }

    return water;  //This code returns the total amount of water that can be trapped in the input array.
    }


    public static void main(String[] args) 
    {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println(trap(height));
    }

}

/* 
        Input array: {4,2,0,6,3,2,5}

        Explanation:
        The tallest bar in the array is at index 3 with a height of 6.
        The amount of water that can be trapped to the left of the tallest bar is 4 - 2 = 2.
        The amount of water that can be trapped to the right of the tallest bar = 9

        Input array: [4,2,0,6,3,2,5]

        Step 1:
        Declare the variables:
        water = 0
        maxLeft = 0
        maxRight = 6
        max = 3

        Step 2:
        Find the tallest bar in the array:
        max = 3

        Step 3:
        Calculate the amount of water that can be trapped to the left of the tallest bar:
        water += height[maxLeft] - height[1] = 4 - 2 = 2
        maxLeft = 1

        water += height[maxLeft] - height[2] = 4 - 0 = 4
        maxLeft = 2

        Step 4:
        Calculate the amount of water that can be trapped to the right of the tallest bar:
        water += height[maxRight] - height[4] = 5 - 3 = 2
        maxRight = 4

        water += height[maxRight] - height[5] = 5 - 2 = 3
        maxRight = 5

        Step 5:
        Return the total amount of water that can be trapped:
        return water = 11

        Output: 11

*/
