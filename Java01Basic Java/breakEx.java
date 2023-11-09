

import java.util.*;

public class breakEx {
    public static void main(String[] args){

        for(int i=1; i<=7; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I AM OUT!!");
    }

}


/*
 The code snippet you provided is a Java program that uses a for loop to iterate from 1 to 7. 
 Inside the loop, it checks if the current value of i is equal to 5. 
 If it is, the program executes the break statement, which immediately exits the loop. 
 If i is not equal to 5, the program prints the value of i. After the loop, it prints "I AM OUT!!".

Flow:
------
The for loop is initialized with i set to 1.
The loop continues as long as i is less than or equal to 7.
Inside the loop, the condition i==5 is checked.
If the condition is true, the break statement is executed, causing the loop to terminate.
If the condition is false, the value of i is printed.
After the loop, the message "I AM OUT!!" is printed.

Output:
-------
1
2
3
4
I AM OUT!!

public static void main(String[] args){

    for(int i=1; i<=7; i++){
        if(i==5){
            break;
        }
        System.out.format("%d%n", i);
    }
    System.out.println("I AM OUT!!");
}

----------------------------------------
public static void main(String[] args){
    printNumbers();
    System.out.println("I AM OUT!!");
}

public static void printNumbers() {
    for(int i=1; i<=7; i++){
        if(i==5){
            break;
        }
        System.out.println(i);
    }
}
----------------------------------------
final int START = 1;
final int END = 7;
final int BREAK_VALUE = 5;

for(int i=START; i<=END; i++){
    if(i==BREAK_VALUE){
        break;
    }
    System.out.println(i);
}
----------------------------------------
 */