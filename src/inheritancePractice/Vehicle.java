package inheritancePractice;

public abstract class Vehicle {
    double speed;

    void go() {
        System.out.println("This vehicle is moving");
    }

    void stop() {
        System.out.println("This vehicle is stopped");
    }

    //public abstract void go();
}
//have my car and bicycle class inherit from vehicle class which is the super class or parent class

//in vehicle list a few variables that applys to both classes.
//in parent class should list universal variables that applies to all classes being inherited.

//apply 2 methods a go and stop method. (dont require a access or and not returning.
//now that i have everything related to my vehicle listed i apply to the children class of car and bicycle via extened.to receive these methods and attributes.

//in order to use inheritance when you define the class place keyword "extends" followed by parent class.

//vehicle class knwon as super class--the bicycle and car class are considered sub-classes.

//vehicle is an ancestor giving inheritance to its descendents.

//the subclass uses constructors syntax;
//public String name;