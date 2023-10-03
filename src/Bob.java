import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Asking bob a question");
//        String userInput = scanner.nextLine();
//
//        //Solved with conditionals only
//       if (userInput.endsWith("?")) {
//                System.out.println("Sure");
//            } else if (userInput.endsWith("!")) {
//                System.out.println("Whoa, chill out!");
//            } else if (userInput.isEmpty()) {
//                System.out.println("Fine. Be that way!");
//            } else {
//                System.out.println("Whatever");
//            }

        //Refactored with loop

        do {
            System.out.println("Asking bob a question");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Anymore questions for Bob? [y/n]");
            String moreQuestions = scanner.nextLine();
            if (moreQuestions.equals("n")) {
                System.out.println("Ok, Have a good day");
                break;
            }

        } while(true);
    }
}
