/* 
 Bubble sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them 
 if they are in the wrong order. This process is repeated until the entire array is sorted.
*/

package Java06BasicSortingAlgo;

import java.util.Arrays;
public class bubbleSorting01
{


    public static void bubbleSort(int[] unsortedArray) 
    {
        int n = unsortedArray.length; // This line initializes a variable n to store the length of the input array.

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1])
                /* This if statement checks if the current element (unsortedArray[j]) is greater than 
                the next element (unsortedArray[j + 1]). If it is, then the elements are in the wrong order. */ 
                {
                    // Swap the elements
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                    /* If the elements are in the wrong order, this code swaps them using temporary variables. 
                    The current element is stored in temp, the next element is moved to the current position, 
                    and temp is moved to the next position. */
                }
            }

            /* This nestedfor loop iterates n - i - 1 times, where i is the current iteration of the outer loop. 
            The purpose of this loop is to compare adjacent elements in the array and swap them if they are in the wrong order. */
        }
        /* This for loop iterates n - 1 times, where n is the length of the array. 
        The purpose of this loop is to make multiple passes through the array to gradually sort the elements. */
    }

    public static void main(String[] args) 
    {
        int[] unsortedArray = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        System.out.println("Before sorting: " + Arrays.toString(unsortedArray));
        bubbleSort(unsortedArray);
        /* This line calls the bubbleSort function, passing the unsorted array as an argument. 
        The bubbleSort function sorts the array in ascending order. */
        System.out.println("After sorting: " + Arrays.toString(unsortedArray));
    }

}

/* 
In summary, the provided code implements the bubble sort algorithm to sort an array of integers in ascending order. 
The bubble sort algorithm repeatedly compares adjacent elements and swaps them if they are in the wrong order. 
This process is repeated until the entire array is sorted.

* Bubble sort is an in-place sorting algorithm, meaning that it does not require any additional memory to store the sorted elements.
* Bubble sort is guaranteed to sort any input array, even if the elements are already sorted.
* Bubble sort is a stable sorting algorithm, meaning that it preserves the original order of elements with equal values.

Overall, bubble sort is a simple and efficient algorithm for small input arrays. 
However, its quadratic time complexity makes it less suitable for large input arrays.

Example:

Consider an array of 5 elements: {5, 2, 4, 1, 3}. 
The bubble sort algorithm would make 4 passes through the array, as follows:

Pass 1: {5, 2, 4, 1, 3} => {4, 2, 1, 3, 5}
Pass 2: {4, 2, 1, 3, 5} => {3, 2, 1, 4, 5}
Pass 3: {3, 2, 1, 4, 5} => {2, 1, 3, 4, 5}
Pass 4: {2, 1, 3, 4, 5} => {1, 2, 3, 4, 5}

The time complexity of bubble sort is O(n^2), where n is the length of the input array. 
This means that the running time of bubble sort grows quadratically with the size of the input.

The space complexity of bubble sort is O(1), where 1 is a constant value. 
This means that the amount of additional memory used by bubble sort is independent of the size of the input.
*/
