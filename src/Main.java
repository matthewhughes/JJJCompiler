public class Main {

    public static void main(String[] args) {
	WelcomeAndFileActions WAFA = new WelcomeAndFileActions();
    JSONManipulations JM = new JSONManipulations();
    WAFA.Welcome();
    WAFA.CheckArgs(args);
    String FilePath = WAFA.GetPath(args[0]);
    String FileContents = WAFA.OpenFileAndConvert(FilePath);
    WAFA.PrintContentsOfFile(FileContents);
    String CurrentDirectory = WAFA.GetCurrentDirectory();
    JM.CreateOutputFile(CurrentDirectory, args[1]);
    JM.ConvertIntoJSON(FileContents);
    }
}
