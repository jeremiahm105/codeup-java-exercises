//package FileIOPractice;
//
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class FileMain {
//
//    public static void main(String[] args) throws IOException {
//        //this writer an write to many things but first we must tell it what to write to in paren.
//        // we use new file writer and we pass in the file we want to create
//        //String[] names = {"john", "carl", "jerry"};  //now going to loop through array and write each element to the file.
////        try {
////            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
////            writer.write("Writing to a file.");
////            writer.write("\nHere is another line.");
////
////            for (String name : names) {
////            writer.write("\n" + name);}
////            writer.close(); // without this step the file will be created but nothing will be written to it
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
////before the loop we declare a string to hold each line of text as we read it
//        ///this reads a line of text from ou file and put that line line of text in our line variable and when it reaches the end of the file the line will be null because theres no other lines to read
//
////        try {
////            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
////            String line;
////            while ((line = reader.readLine()) != null) {
////                System.out.println(line);
////            }
////            //System.out.println(reader.readLine());//save to a var or print to terminal which only reads one line to read all lines we need a loop specifically a while loop
////            reader.close();
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//
//
//
//        String myDataDirectory = "src/FileIOPractice/data_new";
//        Path pathNewDirectory = Paths.get(myDataDirectory);
//
//            if (Files.notExists(pathNewDirectory)) {
//                Files.createDirectory(pathNewDirectory);
//            }
//        }
//
//
////the Path.directory will be the only of the last of h end of it all
//        //Using a relative path to create a directory and file if they do not yet exist:
//        String directory = "data";
//    String filename = "info.txt";
//
//    Path dataDirectory = Paths.get(directory);
//    Path dataFile = Paths.get(directory, filename);
//
//if (Files.(dataDirectory)) {
//        Files.createDirectories(dataDirectory);
//    };
//
//if (! Files.exists(dataFile)) {
//        Files.createFile(dataFile);
//    };
//
//
//
////        File file = new File("/Users/jeremiahmatthews/IdeaProjects/codeup-java-exercises/src/FileIOPractice/filemessage.txt");
////        if (file.exists()) {
////            System.out.println("that file exist");
////            System.out.println(file.getPath());
////            System.out.println(file.getAbsolutePath());
////            System.out.println(file.isFile());
////            file.delete();
////        } else {
////            System.out.println("that file does not exist");
////        }
//
//    }
//
////In the example above, I used the absolute path because the relative path was not working
////After file.delete you must refresh the terminal to see completely remove the file.
//
////to write to a file we used bufferedWriter
////to read to a file we will use buffered reader
////and the last of the end of the at tghe ,last of the first and for the beginning at the end at the very first beginning not to mention fot very end of the only for the