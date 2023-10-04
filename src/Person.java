
public class Person {
    private String name;

    //Instance variable
    //private String name;


    //Constructor one--Empty.
    public Person(){}

    //Constructor takes a string argument name and sets the name instance variable to the value.
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

    //Main class method.
    public static void main(String[] args) {

        Person person1 = new Person("Jay");  //Uses constructor with string
        person1.sayHello();

        Person person2 = new Person();  //Uses no argument constructor
        person2.setName("John");
        person2.sayHello();
        System.out.println(person2.getName());

        Person person3 = new Person("JimBob");
        person3.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    } //end of main-class
}
