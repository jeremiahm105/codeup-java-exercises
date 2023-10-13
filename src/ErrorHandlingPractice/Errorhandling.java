package ErrorHandlingPractice;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Errorhandling {

    public static void main(String[] args) {

        // exception = 	an event that occurs during the execution of a program that,
        //				disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);
        try {
//                Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);

        }

        catch(ArithmeticException e) {
            System.out.println("You can't divide by zero! IDIOT!");
        }
        catch(InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
        }

        //Catches all exceptions
        catch(Exception e) {
            System.out.println("Something Went Wrong");
        }
        //Will always execute regardless if we catch anything or not
        finally {
            System.out.println("This will always print");
            //Good use of the finally block is to close any open scanners or files you want to close by using scanner.close();
            scanner.close();
        }

    }
}
//Exception occurs during execution of a program that disrupts the normal flow of program

//The last of the exception and the first of the exceptions are both good to go.
