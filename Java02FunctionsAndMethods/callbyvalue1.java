package Java02FunctionsAndMethods;

public class callbyvalue1 {
    public static void main(String[] args)
    {
        //swap values

        int a = 9;
        int b = 18;

        //swap karo

        int temp = a;
        a = b;
        b = temp;

        System.out.println("the value of a is now = " + a);
        System.out.println("the value of b is now = " + b);
        //System.out.printf("the value of a is now = %d%n", a);
        //System.out.printf("the value of b is now = %d%n", b);   
    }
    
}

/*
    --------------------------------------------------
    
    output:
    -------
    the value of a is now = 18
    the value of b is now = 9

    --------------------------------------------------


    This code snippet swaps the values of two variables a and b. 
    It uses a temporary variable temp to store the value of a, 
    then assigns the value of b to a and finally assigns the value of temp to b. 
    The values of a and b are then printed.

    --------------------------------------------------

    int a = 9;
    int b = 18;

    int temp = a;
    a = b;
    b = temp;

    System.out.println("the value of a is now = " + a);
    System.out.println("the value of b is now = " + b);

    ---------------------------------------------------
 */
