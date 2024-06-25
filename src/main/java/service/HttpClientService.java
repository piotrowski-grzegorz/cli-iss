package service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientService<T> {
    private static String STRING_URL;

    HttpClient client = HttpClient.newHttpClient();

    public HttpResponse<String> getResponse(String url) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .header("key", "itXDsoSsZeWgG5kM9heB2Q==nJ73ptbDeIz7WQiv")
                .uri(URI.create(url))
                .build();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
    }
}
