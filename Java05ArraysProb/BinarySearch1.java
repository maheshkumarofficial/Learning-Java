package Java05ArraysProb;

public class BinarySearch1 {
    public static int binarySearch(int numbers[], int key)
    {
        int start=0, end = numbers.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            //comparisons
            if (numbers[mid] == key) // Key found
            {
                return mid;
            }
            
            if (numbers[mid] < key) // Right side m search karo bhai
            {
                start = mid + 1;
            }
            else // Left side m search karo bhai
            {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int numbers[] = {2,4,6,8,10,12,14,16,18};
        int key = 8;

        System.out.println("Index for the given key is:" + binarySearch(numbers, key));
    }
}
