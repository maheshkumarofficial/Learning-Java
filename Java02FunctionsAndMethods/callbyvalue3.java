package Java02FunctionsAndMethods;


// JAVA showcasing uses of call by values
// Importing JAVA input/output classes


//class
public class callbyvalue3 {

    //Method to swap numbers
    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;

    }

    public static void main( String [] args)
    {
        int x = 56;
        int y = 69;
        swap(x,y);

        System.out.println("Before swapping X = " + x + " and Y = " + y);
        // Using above method to swap
        System.out.println("After swapping X = " + x + " and Y = " + y);

    }
}

/*
    This code snippet defines a main method in Java. 
    It initializes two variables x and y with the values 56 and 69 respectively. 
    Then it prints the initial values of x and y. 
    However, there is no code to actually swap the values of x and y, 
    so the final output will be the same as the initial output.
 */