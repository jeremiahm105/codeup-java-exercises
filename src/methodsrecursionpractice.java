import static java.nio.file.Files.isDirectory;
import static java.nio.file.Files.walk;

public class methodsrecursionpractice {
    public static void main(String[] args) {

        //RECURSION

        //Apply result of a procedure to a procedure-- A method that calls itself
        //Can be a substitute for iteration or loop.
        //Advantages-easier to read/write and debug
        //Disadvantages-- use more memory and more slower

        //Example--calling the method

        walk(5); //invoke method with amount of steps we want to walk

    } //end of main-method

    //Example--creating a iterative walk method
//    private static void walk(int steps) {
//        for (int i = 0; i < steps; i++) {
//            System.out.println("You take a step!");
//        }
//    }

    //Example--creating a walk method using recursion
    //need a base case-- is what we need when we want to stop
    //recursive case when we want to continue
    //if there is only one statement within a if statement we can get rid of curly braces
    // is slower because we are adding more frames to the call stack that go in the form of last in first out LIFO
    private static void walk(int steps) {
        if (steps < 1) return; //considered our base case-- ending
        System.out.println("You take a step with recursion");
        walk(steps - 1); // considered our recursive case --beginning

    }

}
