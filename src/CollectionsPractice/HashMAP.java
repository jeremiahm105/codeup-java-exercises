package CollectionsPractice;

import java.util.HashMap;

public class HashMAP {

    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<String, String>();

        //add a key and value

        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijeng");
        //countries.get("USA");
        System.out.println(countries.get("USA"));  //must be put ion var or printed to terminal

        //use the get default as a if else if key does not exist, print the default value message.
        //System.out.println(countries.getOrDefault("alabama", "Error message"));
        countries.remove("Russia"); //key is case sensitive
        System.out.println(countries);


        //countries.remove("USA");
        //countries.get("Russia"); //use to get to capital of russia put on a print line
        //System.out.println(countries.get("Russia"));

        //countries.clear();
        //System.out.println(countries.size()); //prints index number
        //System.out.println(countries);

        //countries.replace("USA","Detroit");
        //System.out.println(countries);

//        for (String i: countries.keySet()) {  //.keyset iterates one for each key
//            System.out.print(i + "\t" + "= ");
//            System.out.println(countries.get(i));
//        }


    }
}
