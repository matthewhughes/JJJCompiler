import java.io.*;
import java.util.Scanner;


public class WelcomeAndFileActions {
    void Welcome(){
    System.out.println("Welcome to the Java!Java!JSON compiler");
    System.out.println("By Matthew Hughes");
    System.out.println("http://matthewhughes.co.uk");
    System.out.println("me@matthewhughes.co.uk");
    }
    void CheckArgs(String[] args) {
        if(args.length < 2){
            System.out.println("Not enough arguments");
            System.out.println("Correct usage is JJJCompiler <code.json> <outputname>");
            System.out.println("Leaving Now. Bye!");
            System.exit(1);
        } else {
            System.out.println("Opening JSON Code");
        }
    }
    String GetPath(String Filename){
        // Yes, this is a horrible, horrible hack.
        // Yes, this basically means that this code won't really work on anyone else's computer.
        // Yes, I'm a fuckwit.
        // Yes, I'll fix it later.

        return "/home/matthew/IdeaProjects/JJJCompiler/src/" + Filename;
    }
    String OpenFileAndConvert(String FileAndPath) {
        String ContentsOfFile = null;
        try {
            // Full disclosure. This one-liner was borrowed from Stack Overflow.
            // http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file
            // It's not plagiarism if I fess up to it, right?
            ContentsOfFile = new Scanner(new File(FileAndPath), "UTF-8").useDelimiter("\\A").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found.");
            System.out.println("Remember that file names are case sensitive.");
            System.out.println("Exiting Now");
            System.exit(1);
        }
        return ContentsOfFile;
    }
    void PrintContentsOfFile(String FileContents){
        System.out.println(FileContents);
    }
    String GetCurrentDirectory() {
        String Directory = System.getProperty("user.dir");
        return Directory;
    }

}
