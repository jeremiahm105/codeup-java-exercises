package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        boolean confirm;
        Input input = new Input();
        int totalCircles = 0;
        do {
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            totalCircles++;

            System.out.println("The circumference is: " + circle.getCircumference());
            System.out.println("The area is: " + circle.getArea());
            System.out.println("Total Circles: " + totalCircles);

            confirm = input.yesNo();
        } while(confirm);
        System.out.println("Thanks, till next time!");

    }
}