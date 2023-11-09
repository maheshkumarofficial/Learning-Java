package Java02FunctionsAndMethods;

public class OddEven2 {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int testNumber = 7;  // Replace this with the number you want to test

        if (isEven(testNumber)) {
            System.out.println(testNumber + " is even.");
        } else {
            System.out.println(testNumber + " is not even.");
        }
    }
    
}
