package cloths_warmup;

public class Cloths {

    public String type;
    public String color;
    public String size;

    public static void main(String[] args) {

        Cloths shirt = new Cloths();
        shirt.type = "Collard";
        shirt.color = "Blue";
        shirt.size = "Large";
        System.out.println(shirt.type);
        System.out.format("I like wearing %s shirts that are size %s and color %s, which is my favorite color. %n",shirt.type, shirt.size, shirt.color);

        Cloths pants = new Cloths();
        pants.type = "Chinos";
        pants.color = "Navy Blue";
        pants.size = "Large";
        System.out.println(pants.type);
        System.out.format("I like wearing %s pants that are size %s and color %s, which is my favorite color. %n",pants.type, pants.size,pants.color);


    } //end of main
}
