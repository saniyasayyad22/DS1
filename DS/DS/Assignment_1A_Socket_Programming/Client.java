import java.io.*;
import java.net.*;

public class Client {

    public static void main(String args[]) {

        try {

            Socket socket = new Socket("localhost", 25000);

            BufferedWriter bw =
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream()));

            bw.write("2\n");

            bw.flush();

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            String message = br.readLine();

            System.out.println("Message received from server is " + message);

            socket.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}