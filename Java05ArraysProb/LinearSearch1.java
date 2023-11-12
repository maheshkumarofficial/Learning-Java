package Java05ArraysProb;

public class LinearSearch1 {

    public static int LinearSearch(int  marks[], int key)
    {
        for(int i=0; i< marks.length; i++)
        {
            if(marks[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int marks[] = {0,2,4,6,8,10,12,14,16,18};
        int key = 10; // apun log ko 10 no. ka key search krne ka hai.

        int index = LinearSearch(marks, key);
        if(index == -1)
        {
            System.out.println("Error:404! Not Found!!");
        }
        else{
            System.out.println("The key is at index :" +" "+ index);
        }
    }
    
}


/*
    Output: The key is at index : 5   

    ** Initialize an array marks with some values.
    ** Assign the value 10 to the variable key.
    ** Call the LinearSearch method with the marks array and key as arguments.
    ** In the LinearSearch method, iterate through the marks array using a for loop.
    ** Check if the current element is equal to the key.
    ** If a match is found, return the index of the element.
    ** If no match is found, return -1.
    ** In the main method, check the value of index.
    ** If index is -1, print an error message indicating that the key was not found.
    ** If index is not -1, print the index where the key was found.
 */