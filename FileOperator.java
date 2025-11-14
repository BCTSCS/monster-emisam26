import java.io.*;
import java.util.*;
import java.net.*;

public class FileOperator {
    private File myFile;
    private Scanner fileReader;

    public FileOperator(String f) throws IOException{
        setFile(f);
    }

    public FileOperator(String url, boolean isOnline) throws IOException, MalformedURLException, URISyntaxException{
        if (isOnline){
            setUrl(url);
        } else {
            setFile(url);
        }
    }

    // public URL(String spec) throws MalformedURLException{
    //     return 
    // }

    public void setFile(String f) throws IOException{
        myFile = new File(f);
        fileReader = new Scanner(myFile);
    }

    public void setUrl(String f) throws IOException, MalformedURLException, URISyntaxException{
        // URL url = new URL(f);
        URL url = new URI(f).toURL();
        fileReader = new Scanner(url.openStream());
    }

    public void close(){}

    public String readLine(){
        // return fileReader.nextLine();
        if (fileReader.hasNextLine()){
            return fileReader.nextLine();
        } else {
            return null;
        }
    }

    public static void main(String[] args) throws Exception{
        FileOperator online = new FileOperator("https://people.sc.fsu.edu/~jburkardt/data/csv/airtravel.csv", true);

        String line = online.readLine();

        while (line != null) { 
            System.out.println(line);
            line = online.readLine();
        } 
    }
    
}
