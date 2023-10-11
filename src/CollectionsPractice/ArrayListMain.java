package CollectionsPractice;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String >();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        food.add("Drinks");
        //System.out.println("");
        System.out.println(food.size());

        //useful methods fo array list .set --allows you to set a value at a certain index
        //this method now replaces the pizza value with sushi
        food.set(0,"sushi");
        food.set(1,"cheesecake");
        food.remove(3);
        food.add("water");

        System.out.println(food.contains("cheesecake")); //returns boolean value true or false


        //food.remove(2);  //removes hotdog only prints sushi and hamburger
        //food.clear(); //clears the complete array list prints nothing
        //in the loop the i stands for the element of the array name after the :
        for (String i : food) {
            System.out.println(i);
        }



//        for (int i = 0; i < food.size(); i++) {
//            System.out.println(food.get(i));
//
//
//            //for each: datatype index name : (means in) array name
//
//
//
//        }
    } //main method end
}
//to add values to list use add function
//display array using for loop and .size instead of .length