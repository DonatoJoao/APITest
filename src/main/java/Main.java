import javax.sound.sampled.SourceDataLine;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        Scanner scn = new Scanner(System.in); //para capturar entrada da palavra a ser pesquisada
        System.out.println("Type a word to search:");
        String word = scn.next();

        URI api = URI.create("https://api.dictionaryapi.dev/api/v2/entries/en/"+word);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(api)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);
    }
        /*
        TODO:
            - Próximo passo é selecionar/modelar a saída com somente algumas informações desejadas
         */
}
