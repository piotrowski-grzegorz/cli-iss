package service;

import api.LocationResponse;
import api.PeopleInSpaceResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.sql.Timestamp;
import java.time.Instant;

public class IssService {

    private static final String ASTROS_API_URL = "http://api.open-notify.org/astros.json";
    private static final String LOCATION_API_URL = "http://api.open-notify.org/iss-now.json";
    private static final HttpClientService<String> service = new HttpClientService();
    private static final ObjectMapper mapper = new ObjectMapper();



    public void getPeopleInSpace() throws IOException, InterruptedException {
        HttpResponse<String> response = service.getResponse(ASTROS_API_URL);
        PeopleInSpaceResponse posts = mapper.readValue(response.body(), new TypeReference<PeopleInSpaceResponse>() {
        });
        System.out.println(posts);

    }

    public void getIssLocation() throws IOException, InterruptedException {
        HttpResponse<String> response = service.getResponse(LOCATION_API_URL);
        LocationResponse locationResponse = mapper.readValue(response.body(), new TypeReference<>() {
        });
        System.out.println(locationResponse);

    }
}
