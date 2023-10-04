public class methodspractice {
    public static void main(String[] args) {
        //Method--block of code executed whenever called upon
        //Within the main method we call or invoke our new method
        //We can pass a string var into a method when we call it
        //The values or variables passed through the calling methods are arguments
        //In order to pass the arguments in our method we need a matching set of parameters which are passed in the main method we created outside the main.

        //EXAMPLE passing parameters and arguments
        String name = "Bro";
        int age = 21;
        hello(name, age);

        //EXAMPLE RETURNING Method 1
        int x = 3;
        int y = 4;
//        add(x, y);
//        int z = add(x, y);
//        System.out.println(z);

        //EXAMPLE RETURNING Method 2 just call the ,method inn the print instead of a variable.
        System.out.println(add(x,y));

    } //End of main-method.

    //Creating a new method
    //With parameters and argument names dont need to keep the names consistent with the Strings being called. you just need a match set of parameters.
    //In usiung the creating method we must include use of the parameter in the created methods as well as the establishing the value in the main method

    //Example passing parameters and arguments
    public static void hello (String wahoo, int age) {
        System.out.println("Hello " + wahoo);
        System.out.println("You are " + age);
    }

    //EXAMPLE RETURNING Method 1
    public static int add(int x, int y) {
//        int z = x + y;
//        return z;

    //EXAMPLE RETURNING Method 2 --remove from variable and just return
    return x + y;
    }









}
