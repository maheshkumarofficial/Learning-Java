package Java05ArraysProb;

public class PassingVariableInFunctionByReference {
    
    public static void update (int marks[], int NonChangable)
    {
        NonChangable = 10;

        for (int i = 0; i< marks.length; i++)
        {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args)
    {
        int NonChangable = 5;
        int marks[] = {97, 98, 99};
        update(marks, NonChangable);

        System.out.println(NonChangable);
        //print out marks
        for (int i = 0; i< marks.length; i++)
        {
            System.out.println(marks[i] + " ");
        }
        //System.out.println();
    }


}