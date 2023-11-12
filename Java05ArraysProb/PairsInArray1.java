package Java05ArraysProb;

public class PairsInArray1 
{
   
    public static void pairs(int numbers[])
    {
        for(int i=0; i<numbers.length; i++)
        {
            int current = numbers[i]; // pehle current = 2 hoga, then 4->6->8->. 10 m aa ke terminate ho jaega!
            for(int j=i+1; j<numbers.length; j++)
            {
                System.out.print("(" + current + "," + numbers[j] + ")");
            }
            System.out.println();     


        }
    }

    public static void main(String[] args) 
    {
        int numbers[] = {2,4,6,8,10};

        pairs(numbers);
    }

}

/*
    output:
    -------
    (2,4)(2,6)(2,8)(2,10)
    (4,6)(4,8)(4,10)
    (6,8)(6,10)
    (8,10)
 */