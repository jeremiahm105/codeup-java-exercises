public class car {

    //Classes let us define custom objects - imagine it as a blueprint, template, or character sheet to be followed

        //Classes have fields - fields are variables (properties of WHAT a class is) and methods (ACTIONS/BEHAVIORS a class can do)

        //First example: Make; model, year, honk() [model + make + " honks its horn!"] fields
//
//    public String name;
//    public String model;
//    public int year;
//
//    Car kennyCar = new Car();  //goes in main method
//
//    kennyCar


    //Static - an instance of a class (an object) can have individual and unique values to their fields. Non-unique fields are flagged with the 'static' keyword.

    //Let's look at the Math object
    //double piExample = Math.PI; //Command click 'Math' to see the entire object, 'PI' to see the property of the object

        //We usually start using the Math object to think about static since we don't make a unique instance of Math - there is only a global thing CALLED Math that would never have a personal, unique copy of it made (Kenny's Math vs Gilly's Math vs. Gonzo's Math < that doesn't make sense! There is only Math!"

        //Second example: static carInventoryCount property.

        //Constructors - all constructors are methods, all methods can be overloaded.

        //Third example: car constructor method that auto-increments static carInventoryCount when each car is made

        //Fourth example: overloading constructor to allow for missing model / year

        //This - think of it as saying ME, MYSELF, THIS object.

        //Fifth example: logCarInfo()

        //Visibility - let's set up a private String that is carOwner and set up a small application running class called dealershipApp to see if we can access info in the other class.

}

//class is considered a template or blueprint all classes have fields.
//field something a object can perform. a method or variable. accessed by .operator
//static belongs to class or instance that belongs to
//an object is an instance of a class' its a reference to a class