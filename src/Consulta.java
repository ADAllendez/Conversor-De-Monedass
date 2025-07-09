import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {
    private static final String API_KEY = "5e6d32568d9579111667fe46";

    public Monedas buscarMoneda (String base){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+API_KEY+"/latest/"+base);



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri (direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al consumir api");
        }


    }
}
