package Java05ArraysProb;

public class ArrayExample 
{
        public static void main(String[] args) 
        {
            // Create an array of 5 integers
            int[] numbers = new int[5];
    
            // Store some values in the array
            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;
            numbers[3] = 40;
            numbers[4] = 50;
    
            // Print the values in the array
            for (int i = 0; i < numbers.length; i++) 
            {
                System.out.println(numbers[i]);
            }
        }
}
    
/*


    Imagine you have a box and you want to put 10 different fruits in it. You could put each fruit in its own separate box, but that would be a lot of boxes to carry around. Instead, you could put all 10 fruits in one box. This is what an array is like in Java.

    An array is a way to store multiple values of the same data type in a single variable. For example, you could create an array to store the names of all the students in your class. Or, you could create an array to store the scores of all the students on a test.

    To create an array in Java, you need to specify the data type of the array and the number of elements in the array. For example, to create an array of 10 strings, you would use the following code:

    Java
    String[] studentNames = new String[10];
    This code creates an array variable called studentNames that can store 10 strings.

    Once you have created an array, you can start storing values in it. To do this, you use the index of the element in the array. The index of the first element in an array is 0, and the index of the last element in an array is one less than the length of the array.

    For example, to store the name "John Doe" in the first element of the studentNames array, you would use the following code:

    Java
    studentNames[0] = "John Doe";
    To access a value in an array, you also use the index of the element. For example, to access the name of the student in the first element of the studentNames array, you would use the following code:

    Java
    String studentName = studentNames[0];
    Arrays can be very useful for storing and organizing data. For example, you could use an array to store the names of all the students in your class, the scores of all the students on a test, or the prices of all the items in a store.


*/