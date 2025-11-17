
import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;
    public SimpleServer(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        System.out.println("Server started and Listening on port "+ port);
    }
    public void acceptClient() throws IOException{
        socket = serverSocket.accept();
        InputStream i = socket.getInputStream();
        OutputStream o = socket.getOutputStream();
        in = new Scanner(i);
        out = new PrintWriter(o, true);
    }
    public String receiveMessage(){
        return in.nextLine();
    }
    public void sendMessage(String message){
        out.println(message);
    }
    public void close(){

    }
    public static void main(String[] args) throws Exception{
        SimpleServer s = new SimpleServer(8080);
        s.acceptClient();

        FileOperator file = new FileOperator("index.html");
        String user;

        user = s.receiveMessage();
        System.out.println("Headers: "+ user);

        //Send HTTP header to render HTML
        s.sendMessage("HTTP/1.1 200 OK");
        s.sendMessage("Content-Type: text/html");
        s.sendMessage("");

        //respond via File
        String response = file.readLine();
        while (response != null){
            s.sendMessage(response);
            response = file.readLine();
        }

        s.close();

        // SimpleServer s = new SimpleServer(8888);
        // s.acceptClient();

        // FileOperator file = new FileOperator("server.txt");

        // while(true){
        //     String user = s.receiveMessage();
        //     System.out.println("User: "+ user);
        //     if (user.equals("exit")){
        //         break;
        //     }
        //     String response = file.readLine();
        //     s.sendMessage(response);
        //     System.out.println("Us: "+ response);
        // }

        // s.close();
        // try{
        //     SimpleServer s = new SimpleServer(8888);
        //     s.acceptClient();

        //     String user = s.receiveMessage();
        //     s.sendMessage("Received : "+ user);
        //     s.close();
        // }
        // catch (Exception e){
        //     System.out.println("EXCEPTION OCCURED");
        //     e.printStackTrace();
        // }
    }
}
