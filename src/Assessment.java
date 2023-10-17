import java.util.ArrayList;
import java.util.List;

public class Assessment {

    // Create an `Assessment` class with a public static method named `half`. It should accept a number and return the number divided by two.
    public static int half(int number) {
        return number / 2;
    }

    // Within your `Assessment` class create a public static method named `shout`. It should accept a string and return the same string in all uppercase's with 3 exclamation marks added to the end of it.
    public static String shout(String input) {
        return input.toUpperCase() + "!!!";
    }


    // Within your `Assessment` class create a public static method named `removeCats`. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.
    public static List<Animal> removeCats(List<Animal> animalList) {

        List<Animal> moreAnimals = new ArrayList<>();

        for (Animal animal : animalList) {
            if (!animal.getSpecies().equals("Felis catus")) {
                moreAnimals.add(animal);
            }
        }

        return moreAnimals;
    }

    public static void main(String[] args) {

        System.out.println(half(10));
        System.out.println(shout("hello"));

        Animal lion = new Animal("Simba", "Big Cat");
        Animal cat = new Animal("Chuck", "Felis catus");
        Animal dog = new Animal("Spot", "Dog");
        System.out.println(lion.roar());


        List<Animal> animalList = new ArrayList<>();
        animalList.add(lion);
        animalList.add(cat);
        animalList.add(dog);

        List<Animal> filteredList = Assessment.removeCats(animalList);
        for (Animal animal : filteredList) {
            System.out.println(animal.getName() + " " + animal.getSpecies());
        }

    }
}

class Animal {

    //Create an `Animal` class. It should have private instance properties for strings `name` and `species`, and public getters and setters for both.
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //Within your `Animal` class, define an instance method named `roar`. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where `$NAME` is replaced with the value of the name property for that object.
    public String roar() {
        return "I am " + this.name + ", hear me roar!";
    }
}