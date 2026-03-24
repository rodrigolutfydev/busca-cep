package br.com.buscacep.service;

import br.com.buscacep.model.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArquivo {
    public void gravar(Endereco endereco) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter arquivo = new FileWriter(endereco.cep + ".json")) {
            gson.toJson(endereco, arquivo);
            System.out.println("Arquivo salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }
}
