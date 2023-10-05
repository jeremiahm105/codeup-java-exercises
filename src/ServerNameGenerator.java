import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        System.out.println("Server name is: " +  serverName());

    }

    static String[] adjectives = {"ritzy", "ashamed", "bouncy", "fallacious", "free", "big", "large", "alleged", "bizarre", "small"};

    static String[] nouns = {"drama", "climate", "administration", "language", "arrival", "entry", "table", "computer", "diamond", "heart"};

//    Make the instance of the class Random, i.e., Random rand = new Random()
    public static String serverName() {
        Random randomServerName= new Random();
        int adjArray = randomServerName.nextInt(adjectives.length);
        int nounArray = randomServerName.nextInt(nouns.length);
        return adjectives[adjArray] + "-" + nouns[nounArray];

    }

}