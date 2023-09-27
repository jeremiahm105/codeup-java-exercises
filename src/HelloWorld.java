public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        byte myNum = 126;
        System.out.println(myNum);

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string";
        System.out.println(myString);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int a = 4;
        //a = a + 5;
        a += 5;
        System.out.println(a);

        int c = 3;
        int d = 4;
        //d = d * c;
        d *= c;
        System.out.println(d);

        int s = 10;
        int j = 2;
        //s = s / j;
        //j = j - s;
        s /= j;
        j -= s;
        System.out.println(s);
        System.out.println(j);

        int myInt = Integer.MAX_VALUE;

        System.out.println(myInt);

        System.out.println(++myInt);
    }
}
