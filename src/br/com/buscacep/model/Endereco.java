package br.com.buscacep.model;

public class Endereco {
    public String cep;
    String logradouro;
    String complemento;
    String bairro;
    String localidade;
    String uf;

    @Override
    public String toString() {
        return "CEP: " + cep + "\n" +
                "Logradouro: " + logradouro + "\n" +
                "Complemento: " + complemento + "\n" +
                "Bairro: " + bairro + "\n" +
                "Cidade: " + localidade + "\n" +
                "UF: " + uf;
    }
}
