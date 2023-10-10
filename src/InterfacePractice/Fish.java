package InterfacePractice;

public class Fish implements Prey, Predator {
    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from a larger fish");

    }
}


//can apply more tha one interface to a class so here the example for providing 2 interfaces with a comma.hover to short a method
//then hover over the class to