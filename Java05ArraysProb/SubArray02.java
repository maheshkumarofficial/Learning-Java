

// print sum of all the sub-arrays of the above given numbers

package Java05ArraysProb;

public class SubArray02 
{
    public static void PrintSubArraysAndSum(int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println("Ka Sum hoga: " + sum);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        PrintSubArraysAndSum(numbers);
    }
}


/*
2 Ka Sum hoga: 2
2 4 Ka Sum hoga: 6
2 4 6 Ka Sum hoga: 12
2 4 6 8 Ka Sum hoga: 20
2 4 6 8 10 Ka Sum hoga: 30

4 Ka Sum hoga: 4
4 6 Ka Sum hoga: 10
4 6 8 Ka Sum hoga: 18
4 6 8 10 Ka Sum hoga: 28

6 Ka Sum hoga: 6
6 8 Ka Sum hoga: 14
6 8 10 Ka Sum hoga: 24

8 Ka Sum hoga: 8
8 10 Ka Sum hoga: 18

10 Ka Sum hoga: 10
 */