import org.json.simple.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JSONManipulations {

    void CreateOutputFile(String Directory, String OutputName){
        try {
            PrintWriter CompiledCode = new PrintWriter(OutputName + ".JJJ");
            System.out.println("File produced.");
            System.out.println("File located at: " + Directory + "/" + OutputName + ".JJJ");
            // Obviously the above is only true on a *Nix system.
            // I should eventually work out how to determine the user's OS.

        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            System.out.println("Unable to create JJJ file");
            System.out.println("Check your file permissions and try again?");
            System.out.println("Exiting Now");
            System.exit(1);
        }

    }
    void IterateThroughJSON(String JSONInput){
       // Iterate through the JSON and convert the structured assembly to bytecode
        // Again, slightly borrowed from Stack Overflow.
        // Don't blame me for JSON Simple's shit documentation.
        // Code snaffed from http://stackoverflow.com/questions/6697147/json-iterate-through-jsonarray

        JSONObject ConvertObject = new JSONObject(JSONInput);

    }

    String ConvertIntoJSON(String Content){
        Object obj=JSONValue.parse(Content);
        System.out.println(obj);
        return obj.toString();
    }
}
