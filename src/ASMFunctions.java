/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 17/02/13
 * Time: 22:35
 * To change this template use File | Settings | File Templates.
 */
public class ASMFunctions {

    String Add(String Value){
    return "001" + Value;
    }
    String Subtract(String Value){
    return "002" + Value;
    }
    String StoreDirect(String Value){
        return "003" + Value;
    }
    String StoreImmediate(String Value){
        return "004" + Value;
    }
    String JumpTo(String Value){
        return "005" + Value;
    }
    String JumpIfEqualTo(String Value){
        return "006" + Value;
    }
    String JumpIfZero(String Value){
        return "007" + Value;
    }

}
