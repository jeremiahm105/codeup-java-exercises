import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.5f.%n", pi);
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Something: ");
    String userInput = scanner.nextLine();
    System.out.println("You entered :" + userInput + " ");

    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Enter a number");
    int userNumber = scanner1.nextInt();
    System.out.println("the number you entered is :" + userNumber);

//        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Choose 3 words");
        String wordOne = scanner1.next();
        String wordTwo = scanner1.next();
        String wordThree = scanner1.next();
        System.out.printf("The three words are %n %s %n %s %n %s %n", wordOne, wordTwo, wordThree);

        Scanner sentence = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String userSentence = sentence.nextLine();
        System.out.println(" The sentence you entered is:" + userSentence);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter a length: ");
        String lengthStr = scanner3.nextLine();
        int lengthNum = Integer.parseInt(lengthStr);

        System.out.println("Enter a width: ");
        String widthStr = scanner3.nextLine();
        int widthNum = Integer.parseInt(widthStr);
        //        a = l * w
        int totalArea = lengthNum * widthNum;
        System.out.println("The total area is " + totalArea);
        //        p = (2 * l) + (2 * w)
        int totalPerimeter = (2 * lengthNum) + (2 * widthNum);
        System.out.println("The total perimeter is " + totalPerimeter);
        System.out.printf("Area: %s %n Perimeter: %s %n", totalArea, totalPerimeter);

        //Bonus
        System.out.println("Enter a height: ");
        String heightStr = scanner3.nextLine();
        int heightNum = Integer.parseInt(heightStr);
        System.out.println(heightStr);

//        v = l * w * h
        int volume = lengthNum * widthNum * heightNum;
        System.out.println("The total volume is " + volume);

        scanner3.useDelimiter("\n");
    }
}
