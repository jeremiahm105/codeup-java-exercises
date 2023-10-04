import java.util.Scanner;

public class MethodsExerciseReworked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calling Arithmetic Methods
        System.out.println(addition(10, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(10, 5));
        System.out.println(division(10, 5));
        System.out.println(modulus(10, 5));

        //Calling getInteger Method
        getInteger(1, 10);


    } //end of main method

    private static int addition(int x, int y) {
        return x + y;
    }

    private static int subtraction(int x, int y) {
        return x - y;
    }

    private static int multiplication(int x, int y) {
        return x * y;
    }

    private static int division(int x, int y) {
        return x / y;
    }

    private static int modulus(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Thanks for your number. You entered " + userInput);
            return userInput;
        } else {
            System.out.println("Invalid Entry");
            return getInteger(min, max);
        }
    }


} //end of method
