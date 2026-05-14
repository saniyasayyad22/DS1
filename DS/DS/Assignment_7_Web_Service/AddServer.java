import javax.xml.ws.Endpoint;

public class AddServer {

    public static void main(String[] args) {

        Endpoint.publish(
                "http://localhost:8080/add",
                new AddServiceImpl());

        System.out.println("Web Service Started...");
    }
}
