import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        int m1, m2, m3, percent;
        Scanner scn;

        scn = new Scanner(System.in);
        System.out.println("Marks Btao Apna");

        m1 = scn.nextInt();
        m2 = scn.nextInt();
        m3 = scn.nextInt();
        percent = (m1 + m2 + m3) * 100 / 300;

        if(percent > 60) {
            System.out.println("1st");
        } else if(percent >= 50) {
            System.out.println("2nd");
        } else if (percent >= 40) {
            System.out.println("3rd");
        } else {
            System.out.println("FAIL");
        }
    }
}