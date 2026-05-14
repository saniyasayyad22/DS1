import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface AddService {

    @WebMethod
    int add(int a, int b);
}