import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {

        String hostname = args[0];
        int port = Integer.parseInt(args[1]);
        Socket s = new Socket(hostname,port);

        PrintWriter p = new PrintWriter(s.getOutputStream());
        p.println("Client output");
        p.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str = br.readLine();
        System.out.println("Server Response: "+str);
    }
}