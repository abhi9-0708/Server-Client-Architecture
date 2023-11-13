import java.net.ServerSocket;
import java.net.Socket;
public class EchoServer{
    public static void main(String[] args) {
        //when you write serversocket program use try catch block otherwise it will give error
        try{
            System.out.println("Waiting for clients....");
            ServerSocket ss=new ServerSocket(9806);//this serversocket waits for incomming client connection
            Socket soc=ss.accept();
            System.out.println("connection established");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}