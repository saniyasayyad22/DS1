import javax.jws.WebService;

@WebService(endpointInterface = "AddService")
public class AddServiceImpl implements AddService {

    public int add(int a, int b) {

        return a + b;
    }
}