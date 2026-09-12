package Exercicios.exercicio_aula_01.exercicio_01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o titulo do livro para a busca: ");
        var buscarTitulo = teclado.nextLine();

        String key = Oculto.chaveApi;
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + buscarTitulo + "&key=" + key;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
