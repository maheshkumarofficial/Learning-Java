import java.util.*;

public class whileloop2 {
    
    public static void main (String [] args)
    {
        int counter = 0;
        while ( counter<=100)
        {
            System.out.print(counter+ "  ");
            counter++;
        }

        System.out.println();
    }
}

/*

-------
Output:
-------
1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  
26  27  28  29  30  31  32  33  34  35  36  37  38  39  40  41  42  43  44  45  46  47  48  49  50  
51  52  53  54  55  56  57  58  59  60  61  62  63  64  65  66  67  68  69  70  71  72  73  74  75  
76  77  78  79  80  81  82  83  84  85  86  87  88  89  90  91  92  93  94  95  96  97  98  99  100  

This code snippet represents a Java program that prints numbers from 1 to 100 using a while loop. 
It initializes a counter variable to 1 and then enters a while loop that runs as long as the counter is less than or equal to 100. 
Inside the loop, it prints the value of the counter variable and increments it by 1. 
After the loop, it prints a blank line.


 */