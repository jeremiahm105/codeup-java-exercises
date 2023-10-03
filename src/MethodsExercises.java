import java.util.Random;
import java.util.Scanner;

import static java.nio.file.Files.walk;

public class MethodsExercises {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //Methods Called
        System.out.println(addition(10,5));
        System.out.println(subtraction(10, 5));
        System.out.println(division(10, 5));
        System.out.println(multiplication(10, 5));
        System.out.println(modulus(10, 5));

        //Integer Called
        System.out.println(getInteger(1, 10));

        //Factorial Called
        System.out.println(factorial());

        //Dice Called
        diceGame();

    }

    //    Create four separate methods. Each will perform an arithmetic operation:
    public static int addition(int x, int y) {
       return x + y;
    }
    public static int subtraction(int x, int y) {
        return x - y;
    }
    public static int division(int x, int y) {
        return x / y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }


//    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between: " + min + " and " + max);
        int userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max) {
            System.out.println("Thanks for your number");
            return userInput;
        } else {
            System.out.println("Invalid number, please try again");
            return getInteger(min, max);
        }
    }

//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:

    public static long factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int factorialInput = scanner.nextInt();
        int factorialNumber = 1;
        if (factorialInput < 1 || factorialInput >10) {
            System.out.println("Invalid number entered, please try again");
            return factorial();
        }
        for (int i = 1; i < factorialInput; i++) {
            factorialNumber *= i;
        }
        System.out.println("Thanks for the factorial number: " + factorialInput + " Which equals: ");
        return factorialNumber;

    }
    public static void diceGame() {
        Scanner input = new Scanner(System.in); //used to read user input form console
        String userResponse;  //stores the user response if asked to play again
        int numSides;  //stores the number of sides on the dice
        do {  //loop allows user to continue as long as y is selected
            System.out.println("Enter the number of sides for a pair of dice.");
            numSides = input.nextInt();
            System.out.println("Are you ready? [QUIT/ROLL]");
            String choice = input.next(); //sores the user decision to either quit or roll

            if (choice.equalsIgnoreCase("quit")) {
                break;
            }

            int roll1 = roll(numSides); //results of dice roll 1 and 2
            int roll2 = roll(numSides);

            System.out.println("Your first roll was: " + roll1  + " Your second roll was: " + roll2 );

            System.out.println("Would you like to play again? [y/n]");
            userResponse = input.next();

        } while (userResponse.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing");
    }

    public static int roll(int numSides) {   //stimulates rolling dice with specific number of sides from 1 to numsides
        return (int)(Math.random() * numSides + 1);
    }

//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//    Roll two n-sided dice, display the results of each, ask the user if they want to roll the dice again.
//    Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.


}


