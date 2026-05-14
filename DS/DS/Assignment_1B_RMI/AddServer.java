import java.rmi.*;

public class AddServer {

    public static void main(String args[]) {

        try {

            AddServerImpl addServerImpl =
                    new AddServerImpl();

            Naming.rebind("rmi://localhost/AddServer",
                    addServerImpl);

            System.out.println("Server Started");

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}