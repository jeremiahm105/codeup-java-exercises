package inheritancePractice;

public class Main {
    public static void main(String[] args) {

        Bicycle bike = new Bicycle();
//        bike.go();
        Car car = new Car();
//        car.go();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        //now printing each subclass individual attributes by calling their variables
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}

// now we create a car and bicycle object to pass over the attributes and methods to both subclasses

//now we create objects for the subclasses to test our inheritance values.
//now we can print and run the method and it should display the go method list in the parent vehicle

//The Benefit of inheritance is we don't need to list the methods and attributes twice making code less redundant. and we can give the two subclasses their own specific identifiers.

