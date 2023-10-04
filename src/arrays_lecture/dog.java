package arrays_lecture;

public class dog {
    private String breed;

    private String name;
    private int age;

    //constructor
    public dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;

        //getter ans and setters
        public Person(String name) {
            this.name = name;
        }

        //Retrieve the value of the name instance variable.
        public String getName() {
            return this.name;
        }

        //Set the value of the name instance variable.
        public void setName(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.format("Hello, %s\n", name);
        }


    }
}
