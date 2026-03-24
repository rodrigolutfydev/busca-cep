package br.com.buscacep;

import br.com.buscacep.model.Endereco;
import br.com.buscacep.service.ConsultaCep;
import br.com.buscacep.service.GravarArquivo;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();

        while (true) {
            System.out.println("Digite o CEP (ou 0 para sair): ");
            var buscarcep = sc.next();
            if (buscarcep.equals("0")) {
                System.out.println("Encerrando...");
                break;
            }

            Endereco endereco = null;
            try {
                endereco = consulta.obterEndereco(buscarcep);
                System.out.println(endereco);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            if (endereco != null) {
                System.out.println("\nAdicionar esse endereço a um arquivo? 1(Sim) 2(Não)");
                int opcao = sc.nextInt();
                if (opcao == 1) {
                    GravarArquivo gravarArquivo = new GravarArquivo();
                    gravarArquivo.gravar(endereco);
                }
            }
            System.out.println();
        }
    }
}