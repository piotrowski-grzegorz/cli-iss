import api.PeopleInSpaceResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import service.HttpClientService;
import service.IssService;
import java.io.IOException;
public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello");
        IssService service = new IssService();

        service.getPeopleInSpace();
        service.getIssLocation();







    }
}
