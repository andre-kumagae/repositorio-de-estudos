package logica_de_programacao.m01_estruturas_sequenciais;

public class Aula04_TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Joana";
        String sobrenome = " da Silva";
        String nomeCompleto = nome.concat(sobrenome);
        String nomeDois = "Mateus";
        int tamanhoDoNome = nome.length();
        boolean saoIguais = nome.equals(nomeDois);
        System.out.println("\nOlá!! O seu nome \"" + nome + "\" possui " + tamanhoDoNome + " letras.\nO seu sobrenome \"" + sobrenome.trim() + "\" possui " + sobrenome.replace(" ", "").length() + " letras.\nNo total o seu nome completo \"" + nomeCompleto + "\" possui " + nomeCompleto.replace(" ", "").length() + " letras.\n");
        System.out.println("Nome em letras maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Nome em letras minúsculas: " + nomeCompleto.toLowerCase());
        System.out.println(nome + " e " + nomeDois + " são iguais? " + saoIguais);
    }
}
