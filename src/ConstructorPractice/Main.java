package ConstructorPractice;

public class Main {
    public static void main(String[] args) {

        //Normal process of creating a object
        //Human human = new Human();

        //Constructor method process for creating a instance of a object from another file.

        //To pass an argument using a constructor we start to set it up within the class being instanced.
        //Now after the constructor created we pass the arguments with the value inserted such as name, age, weight.
        Human human = new Human("Rick", 20, 150 );
        //Passing arguments is useful because it gives us the ability to have different attributes for different objects with different values for passed arguments.
        //But first we need to assign these values to the attributes of our class which is done in the seperate file done outside of the constructor but with no hardcoded values.

        //To access one of these attribute types in the same object we use the dot operator with whatever were tying to access such as name.
        System.out.printf("Object one name is %s%n", human.name);

        //Create a second human object
        Human human2 = new Human("Jay", 45, 180 );
        System.out.printf("Object two name is %s %n",human2.name);


        //In order to call the void method we created we use syntax object name. method name()
        human.eat();
        human2.drink();

    } //end of main
}


