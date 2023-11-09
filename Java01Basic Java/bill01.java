import java.util.*;;

public class bill01 
{
    public static void main(String [] args)
    {
    

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the cost of PEN");
        float pen = scanner.nextInt();

        System.out.println("Enter the cost of PENCIL");
        float pencil = scanner.nextInt();

        System.out.println("Enter the cost of Erasser");
        float erasser = scanner.nextInt();


        float cost = pen+pencil+erasser;
        System.out.println("The cost of pen + pencil + erasser is = " + cost);

        float totalcost = cost + 0.18f;
        System.out.println("The total cost will be " + totalcost);

        scanner.close();
      
    }
    
}



/*
        OUTPUT:
        -------

        Enter the cost of PEN
        20
        Enter the cost of PENCIL
        180
        Enter the cost of Erasser
        70
        The cost of pen + pencil + erasser is = 270.0
        The total cost will be 270.18
 */
