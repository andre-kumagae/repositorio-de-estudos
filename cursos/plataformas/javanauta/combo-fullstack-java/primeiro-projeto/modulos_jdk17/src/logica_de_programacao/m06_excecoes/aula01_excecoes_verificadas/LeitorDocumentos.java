package logica_de_programacao.m06_excecoes.aula01_excecoes_verificadas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String caminho = System.getProperty("caminho.texto");
        try {
            bufferedReader = new BufferedReader(new FileReader(caminho));
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
