//package PolymorphismPractice;
//
//import inheritancePractice.Vehicle;
//
//public class Main {
//    public static void main(String[] args) {
//
//        //Create an instance of each object
//        Cars car = new Cars();
//        Bicycles bike = new Bicycles();
//        Boats boat = new Boats();
//
//         Vehicle[] racers = {cars, bikes, boats};
//        //Call like functions
////         car.go();
////         bike.go();
////         boat.go();
//         //Better option is to use enhanced for loop.
//
//        for(Object x: racers) x.gogo
//
//
//
//    } //end of main-method
//}
//
//// Polymorphism the ability to identify as more than one datatype
////Greek for many forms.
//
////In the main method we create an instance of each object
//
////Now we store all our objects in an array called vehicle since we extended our subclasses as vehicles -- goal is to store all our objects in array that have something in common and make an array of that type.
//
////Now we define a go method for each of our subclasses and we can call in the main method using a  enhanced for loop.
//
//// Enhanced for loop syntax:
////for (parent name- var name : stored array name) {var name.method called ()};
////because the go method is not defined in the parent class vehicle we can do a override @override in each of the subclasses.