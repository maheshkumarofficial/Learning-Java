package Java02FunctionsAndMethods;


// JAVA showcasing uses of call by values
// Importing JAVA input/output classes


//class
public class callbyvalue4 {

    //Method to swap numbers
    public static void change(int a)
    {
        a = a + 50;

    }

    public static void main( String [] args)
    {
        int a = 56;
        

        System.out.println("Before swapping a = " + a);
        change(a);
        System.out.println("After swapping a = " + a);

    }
}