import java.io.*;
import java.util.*;

public class FileOperator {
    private File myFile;
    private Scanner fileReader;

    public FileOperator(String f) throws IOException{
        setFile(f);
    }

    public void setFile(String f) throws IOException{
        myFile = new File(f);
        fileReader = new Scanner(myFile);
    }

    public String readLine(){
        // return fileReader.nextLine();
        if (fileReader.hasNextLine()) {
            return fileReader.nextLine();
        } else {
            return null; 
        }
    }
}
