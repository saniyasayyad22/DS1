import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class AddClient {

    public static void main(String[] args) throws Exception {

        URL url =
                new URL("http://localhost:8080/add?wsdl");

        QName qname =
                new QName(
                        "http://",
                        "AddServiceImplService");

        Service service =
                Service.create(url, qname);

        AddService addService =
                service.getPort(AddService.class);

        System.out.println(
                "Addition Result: "
                        + addService.add(5, 3));
    }
}