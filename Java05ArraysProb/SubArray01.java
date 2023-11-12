package Java05ArraysProb;

public class SubArray01 
{
    public static void PrintSubArrays(int numbers[])
    {
        int ts = 0; // ts = Toatal Sub-Arrays
        //int sum = 0;

        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            for(int j=i; j<numbers.length; j++)
            {
                int end = j;
                for(int k=start; k<=end; k++)
                {
                    //sum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                //System.out.println("Sum of Toatal Sub-Arrays: " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub-Arrays = " + ts);
    }
    /*
    public static void printSubArrays(int numbers[])
    {
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=i; j<numbers.length; j++)
            {
                for(int k=i; k<=j; k++)
                {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    -----------------------------------------------------

    public static void PrintSubArrays(int numbers[])
    {
        StringBuilder output = new StringBuilder();
        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            for(int j=i; j<numbers.length; j++)
            {
                int end = j;
                for(int k=start; k<=end; k++)
                {
                    output.append(numbers[k]).append(" ");
                }
                output.append("\n");
            }
            output.append("\n");
        }
    System.out.print(output.toString());
    }
    */

    public static void main(String [] args)
    {
        //int numbers[] = {22,33,44,55,66,77,88,99};
        int numbers[] = {2,4,6,8,10};

        PrintSubArrays(numbers);

    }
    
}


/*
 

    SubArrays : 1

            2 
            2 4 
            2 4 6 
            2 4 6 8 
            2 4 6 8 10 

    SubArrays : 2

            4 
            4 6 
            4 6 8 
            4 6 8 10 

    SubArrays : 3

            6 
            6 8 
            6 8 10 

    SubArrays : 4 

            8 
            8 10 

    SubArrays : 5

            10 

    -----------------------------------------------------
    int numbers[] = {22,33,44,55,66,77,88,99};
    -----------------------------------------------------


    22 
    22 33 
    22 33 44 
    22 33 44 55 
    22 33 44 55 66 
    22 33 44 55 66 77 
    22 33 44 55 66 77 88 
    22 33 44 55 66 77 88 99 

    33 
    33 44 
    33 44 55 
    33 44 55 66 
    33 44 55 66 77 
    33 44 55 66 77 88 
    33 44 55 66 77 88 99 

    44 
    44 55 
    44 55 66 
    44 55 66 77 
    44 55 66 77 88 
    44 55 66 77 88 99 

    55 
    55 66 
    55 66 77 
    55 66 77 88 
    55 66 77 88 99 

    66 
    66 77 
    66 77 88 
    66 77 88 99 

    77 
    77 88 
    77 88 99 

    88 
    88 99 

    99
    
    Total Sub-Arrays = 36
*/