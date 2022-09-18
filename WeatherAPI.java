import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class WeatherAPI {

    private static final String SAINT_PETERSBURG_KEY = "474212_PC";
    private static final String API_KEY = "G6fjz2OAXbJx8HnGXHuiS1ZPG1urmxTx";

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        // Сегментированное построение URL
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment(SAINT_PETERSBURG_KEY)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        System.out.println(url.toString());

       // При необходимости указать заголовки
        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();


        String jsonResponse = client.newCall(request).execute().body().string();
        System.out.println(jsonResponse);
    }
}
