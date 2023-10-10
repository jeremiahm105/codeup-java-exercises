package ConstructorPractice;

public class Human {

    //Creating an constructor:
    //1.has the same name as the class
    //2.Followed by parenthesis and curly braces

    //So when creating a instance of this class its going to call the constructor like a method
    //Now anything in the constructor will be called like its a method.
    //Now we can set up parameters and arguments when we create our object placed in the parenthesis
    //Parameter syntax in paren is: datatype property name.

    //Declare the arguments to class above the instance with just the datatype and property
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {

        //Now within the constructor were going to assign the declared values to variables
        //so for all intensive purposes when we create an instance of a class when we create an object imagine the 'this keyword as the method name.
        this.name = name;  //replace object human.name with this.name.
        this.age = age;
        this.weight = weight;

    }
    //The constructor must have matching arguments in the main to make an instance otherwise it wont work properly and must have the "this" keyword in front of it to specify the object otherwise it will print null when ran.

    //Added two methods
    //In order to access an objects attributes from within the class itself we use the "this" keyword.
    void eat () {
        System.out.println(this.name + " is eating");
    }

    void drink () {
        System.out.println(this.name + " is drinking");
    }


}
