import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {

        int port = Integer.parseInt(args[0]);
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str = br.readLine();
        System.out.println("Client Response: "+str);

        PrintWriter p = new PrintWriter(s.getOutputStream());
        p.println("Server output");
        p.flush();
    }
}