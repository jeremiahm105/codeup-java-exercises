package util;
//
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        System.out.println("Please enter a string:");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo(String input){
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public boolean yesNo(){
        System.out.println("Do you agree?");
        String answer = scanner.next();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }
    //Original
//    public int getInt(){
//        System.out.println("Enter an integer:");
//        int userInput = scanner.nextInt();
//        return userInput;
//    }

    //Error Handling Exercise
    public int getInt() {
        try {
        String input = scanner.next();
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
            return getInt();
        }
    }

    public int getIntChoice() {
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        String prompt = "Enter an integer between " + min + " and " + max;
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        while (userInput <= min || userInput >= max) {
            System.out.println(prompt);
            userInput = scanner.nextInt();
        }

        return userInput;
    }
    //Original
//    public double getDouble(){
//        System.out.println("Enter a number:");
//        double userInput = scanner.nextDouble();
//        return userInput;
//    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public double getDouble() {
        try {
        String input = scanner.next();
            return Double.valueOf(input);
        } catch(NumberFormatException e) {
            System.out.println("Invalid input. Please enter a double.");
            return getDouble();
        }
    }

    // When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.
    public Input(){
        this.scanner = new Scanner(System.in);
    }

}