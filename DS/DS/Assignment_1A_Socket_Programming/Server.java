import java.io.*;
import java.net.*;

public class Server {

    public static void main(String args[]) {

        try {

            int port = 25000;

            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Server Started at port: " + port);

            while (true) {

                Socket socket = serverSocket.accept();

                BufferedReader br =
                        new BufferedReader(
                                new InputStreamReader(
                                        socket.getInputStream()));

                String number = br.readLine();

                System.out.println("Message received from client is " + number);

                int returnNumber =
                        Integer.parseInt(number) * 2;

                BufferedWriter bw =
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream()));

                bw.write(String.valueOf(returnNumber) + "\n");

                bw.flush();

                System.out.println("Message sent to client is " + returnNumber);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}