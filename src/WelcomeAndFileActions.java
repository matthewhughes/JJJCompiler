/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 17/02/13
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */
public class WelcomeAndFileActions {
    static void Welcome(){
    System.out.println("Welcome to the Java!Java!JSON compiler");
    System.out.println("By Matthew Hughes");
    System.out.println("http://matthewhughes.co.uk");
    System.out.println("me@matthewhughes.co.uk");
    }
    static void CheckArgs(String[] args) {
        if(args.length < 1){
            System.out.println("Not enough arguments");
            System.out.println("Correct usage is JJJCompiler <code.json>");
            System.out.println("Leaving Now. Bye!");
            System.exit(1);
        }
    }
    static String GetPath(String Filename){
        // Yes, this is a horrible, horrible hack.
        // Yes, this basically means that this code won't really work on anyone else's computer.
        // Yes, I'm a fuckwit.
        // Yes, I'll fix it later.

        String FileAndPath = "/home/matthew/IdeaProjects/JJJCompiler/src/" + Filename;
        return Filename;
    }
    static

}
