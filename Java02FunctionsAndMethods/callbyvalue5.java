package Java02FunctionsAndMethods;


// JAVA showcasing uses of call by values
// Importing JAVA input/output classes


// Q. Find the product of "a" and "b".


//class
public class callbyvalue5 {

    //Method to swap numbers
    public static int multiply(int a, int b)
    {
        int product = a*b;
        return product;

    }

    public static void main( String [] args)
    {
        int a = 56;
        int b = 73;

        int prod = multiply(a,b);
        

        System.out.println("the product of a*b = " + prod);

        prod = multiply(93, 73);
        
        System.out.println("the product of a*b = " + prod);

    }
}