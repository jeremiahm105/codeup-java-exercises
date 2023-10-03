//public class MethodsExercises {
//    public static void sayHello(String[] args) {
//
//
//
//    }
//}
//METHODS

//methods that return something in place of the void element it must also have a return statement if it does not return anything it should be a void ,method.
//void ,methods shluld not return anything.--the return keyword should only be used to exit the method early.
//can have multiple parameters all seperated by commas, each parameter must be identified by a type
//everything must go in side the body the the braces  of the method.
//the code inside methods never run untill the method is called or invoked
//when calling a method we must aslso call with arguments, arguments and parameters must be the same type

//in java parameters are passed by the value copy of the value passed is created inside of a method, and that reassigning a value inside of a method will not change it outside of the method.

//Overloaded methods- should be used sparingly
//methods within a class can have the same name if they have different parameter lists

//Recursion is a concept that aims to solve a problem by dividing it into smaller chunks.

//The core idea of recursion is creating a method that calls itself, but with different parameters than were originally passed.

//Must make sure to have a base case or stop condition so that the method does not call itself over and over again indefinitely.

//recursion can be used instead of a loop

public static void changeString(String s) {
        s = "Wub a lub a dub dub";
        }

public static void main(String[] args) {
        String changeMe = "hello codeup!";

        changeString(changeMe);

        System.out.println(changeMe);
        }
