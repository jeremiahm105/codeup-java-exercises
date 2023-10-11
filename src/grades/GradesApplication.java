package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    static HashMap<String, Student> Students = new HashMap<>();

    public static void main(String[] args) {
        Student Jay = new Student("Jay", 90);
        Jay.addGrade(90);
        Jay.addGrade(80);

        Student John = new Student("John", 85);
        John.addGrade(90);
        John.addGrade(80);

        Student Jim = new Student("Jim", 80);
        Jim.addGrade(90);
        Jim.addGrade(80);

        Student JimBob = new Student("JimBob", 75);
        JimBob.addGrade(90);
        JimBob.addGrade(80);

        Students.put("ajay", Jay);
        Students.put("ajohn", John);
        Students.put("ajim", Jim);
        Students.put("ajimbob", JimBob);


        System.out.println("Welcome!");
        System.out.println("\nHere are the GitHub usernames of our students:");
        userInput();

    }
    //add string print method here to be called in student
    public static void userInput() {

        System.out.println(Students.keySet());
        System.out.println("\nWhat student would you like to see more information on?");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();

        if (Students.containsKey(inputName)) {
            System.out.printf("\nName: %s - GitHub Username: %s - \nCurrent Average: %.2f\n", Students.get(inputName).getName(), inputName, Students.get(inputName).getGradeAverage());
            System.out.println("\nWould you like to see another student?");
            String inputYOrNo = scanner.next();

            if (inputYOrNo.equalsIgnoreCase("n") || inputYOrNo.equalsIgnoreCase("no")) {
                System.out.println("\nGoodbye, and have a wonderful day!");
            }
            else {
                userInput();
            }
        }
        else {
            System.out.printf("\nSorry, no student found with the GitHub username of \"%s\".", inputName);
        }
    }
}