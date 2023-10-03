import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int age = 30;
//        System.out.println(age);
        //variables must be initialized before use and be redefined after use. in order to display the new assigned value you must do another SOP to call the file
        age = 35;
//        System.out.println(age);
        //we can also copy the value of one variable into another
        byte myAge = 50;
        int herAge = myAge;
        //With large numbers you can use a underscore to separate very three digits can be usd just like a comma
        //even though with the long datatype java still thinks the number is to large so to fix this we add an L upper/lowercase to the end as a suffix to read the number as the data type used to initialize it, this removes the error message.
        long viewCount = 3_123_456_789L;
        float price = 10.99F;
        char letteer = 'A';
        boolean isEligible = true;
        System.out.println();
//        For refernce types like String and Date when we type them in press tab based off the package there assigned to intellij will automatically import the package to the top of the page.

//        When declaring primitive types, we don't need to allocate memory, but with reference types we do, therefore we need to create a new object when using,
        //So we use the new operator then repeat the name of the class. So now the variable now is an instance of the Date class
        //An object is an instance of a class
        //this object has members we can access using the dot operator //now.
        //Primitive types do not have members
        Date now = new Date();
        //we calling the variable we enter it with no quotes applying quotes would make it a string or char
//        System.out.println(now); // shortcut is sout tab

        // if we recieve the error message new string is redundant we can amke it a string literal notation instead of a object
        String message = new String("Hello World");  // refactor into String message ="hello World"
        //this refactor is a shorthand to initialize a string variable.
        System.out.println(message);

        //STRING CONCAT
        //Bcasue sstring is a reference type using the dot operator gives us access to its methods, which can be used in the system print class
        String  newMessage ="hello World" + "!!";
        //usoing the indexOf th us the value of eah individual char in the string
        //System.out.println(newMessage.replace("!", "*")); //using these are referred to as arguments
        //this method does not modify our original string it returns a new string because they are immutable
        //System.out.println(newMessage);

        String newMessaage = "Hello \t learning\nMosh"; //adds a new line and a tab and

        //ARRAYS - USED TO STORE A LIST OF ITEMS
        //here we will convert the int number into an int array. we do this by adding [] brackets after int and making the int a new object and in the [] we put how many items we want to include in th array.
        //we access the idividual items in the array by using indexOf after var name

            //int[] numbers = new int[5];
//            numbers[0] = 1;
//            numbers[1] = 2;
        //System.out.println(numbers);  //when we print an array like this java returns a string based off the address of the object in memory

        //to see the actual object in the array use the Array class.
        //Arrays.toString(numbers); //take this and pass it to our print method
        //System.out.println(Arrays.toString(numbers)); //the first two items were initialized others were not //print 1,2,0,0,0
        //boolean arrays by default print false
        //string arrays by default print to empty

        //An easier way to initialize an array
        int [] numbers ={2,3,4,5,1};
        //System.out.println(numbers1.length); //print 5
        //in java arrays have a fixed size meaning you cannot add items to them
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //FLOATS

       final float PI = 3.14F;
        int result = 10 /2;
        //to go from int to decimal we use float or double and place the database name in front of both number in parenthesis on the left and change the database to double on the left

        /*instead of int result = 10 /3; do :*/ double decResult = (double) 10/ (double) 3;
        System.out.println(decResult);

        //implicit casting is when there is no data being lost byye can be converted to all other number types small -> large
        //explicit is when there is loss of data going from large type to small to do this convert the decimal to int by placing passing the (int) infront of the number you want converted.

        double a = 1.1;
        int b = (int)a + 2; //print 3
        //to convert a string into a number use the wrapper class Integer.parseInt--method takes a string and converts to an integer

        String x = "1";
        //Integer.parseInt();
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);

        //To read input from user use scanner class new object

        //Scanner.sc = new Scanner(System.in); //"in" considered a fill in class .out used to print to terminal
        //in parenthesis we specify where were going to read data from ie.. terminal window, file System.in is the terminal window
        //objects have multiple ways to read data all starting with next.

        Scanner scanner = new Scanner(System.in);
        //scanner.nextByte(); //.next is method for reading data and should be chose based on whats being asked and evaluated or read
        //whatever it is rading store it in that database type along with a logial name
        //System.out.println("How old are you");
       // byte newAge = scanner.nextByte();  //if we wanted a decima number we change to nextfloat and change the data type on the left
        //System.out.println("You are " + newAge);

//        To return a string use next by itself
        //System.out.println("Whats your name");

        //all modification method should be attached to the var name
        //String name = scanner.nextLine().trim().toUpperCase();     // only print one word to print multiple words use next.ln
        //next only print one token at a time and each word is considered a token
        //System.out.println("You are " + name);

//        System.out.println("Number: ");
//        int fizNumber= scanner.nextInt();
//        if (fizNumber % 5 == 0 && fizNumber % 3 == 0)
//        System.out.println("FizzBuzz");
//        else if (fizNumber % 3 == 0)
//        System.out.println("Buzz");
//        else if (fizNumber % 5 == 0)
//        System.out.println("Fizz");
//        else
//            System.out.println(fizNumber);

//        LOOPS
        //Repeating the ode 5 times
        // the for loop curly brackets are optional and not required for the code to work.
        for (int i = 5; i > 0; i--)
            System.out.println("Learning Java ".toUpperCase() + i);
        //both of these loops are the same
        int j = 5;
        while (j > 0) {
            System.out.println("While Learning Java" + j);
            j--;
        }

        //String Manipulation
        String pumpkin = "pumpkin";
        String pie = "pie";

        System.out.println(pie.equals(pumpkin));

        String ironMan = "Iron Man";
        System.out.println(ironMan.startsWith("I"));
        System.out.println(ironMan.endsWith("man"));
        System.out.println(ironMan.charAt(0));
        System.out.println(ironMan.indexOf(" ")); //gets the whitespace
        System.out.println(ironMan.lastIndexOf("n")); //type in letter wanted in ()
        //System.out.println(ironMan.charAt("ironMan.indexOf("M")"));

        System.out.println(ironMan.replace("Man", "Guy"));  //the original iron man staus the same if i want to makwe a permanant change i would need to redeclare it.

        String ironGuy = ironMan.replace("Man", "Guy");
        System.out.println(ironGuy);

        //using substring
        System.out.println(ironMan.substring(4));
        System.out.println(ironGuy.substring(1, 4));

    }
}
