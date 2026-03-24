package br.com.buscacep.service;

import br.com.buscacep.model.Endereco;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public Endereco obterEndereco(String cep) throws IOException, InterruptedException {
        if (cep.length() != 8) {
            throw new IllegalArgumentException("CEP inválido! Digite 8 números.");
        }

        if (!cep.matches("[0-9]+")) {
            throw new IllegalArgumentException("CEP inválido! Digite apenas números.");
        }

        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        if (response.body().contains("erro")) {
            throw new RuntimeException("CEP não encontrado!");
        }

        Gson gson = new Gson();
        return gson.fromJson(response.body(), Endereco.class);
    }
}
