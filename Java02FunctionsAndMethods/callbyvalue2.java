package Java02FunctionsAndMethods;

public class callbyvalue2 {
    public static void swap(int a, int b)
    {
       
        //swap karo

        int temp = a;
        a = b;
        b = temp;

        System.out.println("the value of a is now = " + a);
        System.out.println("the value of b is now = " + b);
        //System.out.printf("the value of a is now = %d%n", a);
        //System.out.printf("the value of b is now = %d%n", b);

    }


    public static void main(String[] args)
    {
        //swap values

        int a = 99;
        int b = 18;

        swap (a,b);

    }
    
}