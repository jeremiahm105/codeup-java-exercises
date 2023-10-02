import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //Question 1

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

//        for (int i = 2; i <= 100; i+=2) {
//            System.out.println("For loop value; " + i);
//        }

        //Question 2
        //Write a program that prints the numbers from 1 to 100.

//        for (int i = 0; i <= 100; i++) {
//            System.out.println("For loop of i : " +i);
//        }

        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % (3 * 5) == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//
//        }

//        //Question 3
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What number would you like to go up to? ");
//        int userInput = scan.nextInt();
//        System.out.println(" ");
//        System.out.println("Here is your table!" );
//        System.out.println(" ");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------  | ------");
//        for (int i = 0; i <= userInput; i++) {
//            System.out.printf("%-6s | %-8s | %-7s %n", i, i*i, i*i*i); // can  also get answer with %s for string
//
////            Other ways to solve
////            System.out.printf(i +" | "+ Math.pow(i, 2) +" | "+(i*i*i) +"%n");
////            System.out.printf(i +" | "+ i*i +" | "+(i*i*i) +"%n")
//
//        }

//        Convert given number grades into letter grades.
//
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

       //Declare a string variable to continue inserting grades if the user replies yes
        String insertGrades;
        do {
        //Create a scanner object inorder to read the user input from the console
            Scanner scanner = new Scanner(System.in);
        //Prompt the user for a numerical grade from 0 to 100 just the question on a new line
            System.out.println("Enter your numeric grade: ");
        //create a  variable for the user grade input to store the information
            int userGrade = scanner.nextInt();
        //Begin generating if else statements based off the grades given
            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        //Ask the user if they want to continue entering grades by inserting y anything else exits
        System.out.println("Continue? [y/N]");
        //Reads the user input and stores it in the insert grades variable
            insertGrades = scanner.next();
        //Condition in loop says while y is inserted and ase insensitive repeat the process of inserting grades
        }while(insertGrades.equalsIgnoreCase("y"));
        System.out.println("Thanks, till next time");
    }
}
