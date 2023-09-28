import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        //While Loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("The value of i: " + i);
//            i++;
//        }

        //Do While Loop --(count by 2's starting with 0 and ending at 100)
//        int i = 2;
//        do {
//            System.out.println("Do while loop:" + i);
//            i+=2;
//        } while(i <= 100);

        //Do While Loop--Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do {
//            System.out.println("The value of i is : " + i);
//            i -= 5;
//        }while(i >= -10);

        //Do While Loop--Starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        long i = 2;         //int causes an infinite loop
//        do {
//            System.out.println("The value of i is: " + i);
//            i *= i;
//        }while(i <= 1000000);

        //Refactor with For Loop--Count to 100 by 2's

        for (int i = 2; i <= 100; i+=2) {
            System.out.println("For loop value; " + i);
        }





























    }
}
