import java.net.*;
import java.io.*;

public class Test{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();
    }
    static {
        try {
            Runtime.getRuntime().exec("cmd.exe /c start echo Exploit Successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}