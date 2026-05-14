import java.rmi.*;

public class AddClient {

    public static void main(String args[]) {

        try {

            String addServerURL =
                    "rmi://" + args[0] + "/AddServer";

            AddServerIntf addServerIntf =
                    (AddServerIntf) Naming.lookup(addServerURL);

            double d1 = Double.valueOf(args[1]);

            double d2 = Double.valueOf(args[2]);

            System.out.println("The sum is: "
                    + addServerIntf.add(d1, d2));

        } catch (Exception e) {

            System.out.println("Exception: " + e);
        }
    }
}