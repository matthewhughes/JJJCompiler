public class Main {

    public static void main(String[] args) {
	WelcomeAndFileActions WAFA = new WelcomeAndFileActions();
    WAFA.Welcome();
    WAFA.CheckArgs(args);
    String FilePath = WAFA.GetPath(args[0]);
    String FileContents = WAFA.OpenFileAndConvert(FilePath);
    WAFA.PrintContentsOfFile(FileContents);
    }
}
