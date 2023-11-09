package Java02FunctionsAndMethods;

// Q. Executing Overloading using PARAMETERS.

public class func_overloading1 {

    public static int sumkaro(int a, int b)
    {
        return a+b;
        

    }

    public static int sumkaro(int a, int b, int c)
    {
        return a+b+c;
        

    }

    public static float sumkaro(float a, float b)
    {
        return a+b;
        

    }

    public static double sumkaro(double a, double b)
    {
        return a+b;       

    }


    public static void main(String [] args)
    {
        System.out.println(sumkaro(8,4));
        System.out.println(sumkaro(8,4,6));
        System.out.println(sumkaro(8.9f,4.3f));
        System.out.println(sumkaro(86876458,475));


    }
}
