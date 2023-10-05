//package arrays_lecture;
//
//import java.util.Arrays;
//
//public class arrays_lecture {
//
//    public static void main(String[] args) {
//
//        int[] nums = new int[3]; //instanced array
//        nums[0] = 1;
//        nums[1] = 0;
//        nums[2] = 20;
//        //System.out.println(nums); //
//        //System.out.println(nums[0]);  //to print number to console
//
//        System.out.println(nums.length); //get length then loop through all
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//
//        Dog d1 = Dog("Dalmation", "Domino", 3);
//        Dog d2 = Dog("Chihuahua", "pickles", 20);
//        Dog d3 = Dog("Rotweiler", "bruce", 12);
//        Dog d4 = Dog("Yorkie", "vappy", 1);
//
//        //create an array with dogs created above;  dogs is the variable
//        Dog[] dogs = new Dog[4]; //must specify how many which cannot be changed
//
//        dogs[0] = d1;
//        dogs[1] = d2;
//        dogs[2] = d3;
//     //   dogs[3] = d4;
//
////        for (Dog dog : dogs) {  //foreach loop
////            System.out.println(dog.getName());
////        }
//
////        for (int i = 0; i < dogs.length; i++) {
////            System.out.println(dogs[i]); //print null if havnet assign value
////        }
//
//
////another way to initilize an array with{} braces and loop
//        String[] languages = {"html", "css", "javascript", "java"};
//        for (String language : languages) {   //for (type name : names) {}  enhanced for each loop in java
//            System.out.println(language); //prints all of the array names
//        }
//
//        //The ARRAY CLASS
//        String[] dogArray = new String[4];
//        Arrays.fill(dogArray, "dog");
//        for(String dog : dogArray) {
//            System.out.println(dog);
//        } //prints dog 4 times the amount in the array
//
//        Arrays.sort();
//
//
//    } //end of main
//
//
//}
////Notes
////never going to be an empty array in java