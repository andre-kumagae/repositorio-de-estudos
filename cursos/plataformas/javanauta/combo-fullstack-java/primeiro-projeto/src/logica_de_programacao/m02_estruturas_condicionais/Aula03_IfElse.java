package logica_de_programacao.m02_estruturas_condicionais;

public class Aula03_IfElse {
    public static void main(String[] args) {
        int idade = 15;
        String situacao;
        if (idade >= 18) situacao = "Maior de idade";
        else situacao = "Menor de idade";
        System.out.println(situacao);
        System.out.println();
        boolean estaChovendo = true;
        String tempo;
        if (idade >= 18) tempo = "Vamos sair para passear";
        else tempo = "vamos ficar em casa";
        System.out.println(tempo);
        System.out.println();
        boolean temDinheiro = true;
        boolean temCartao = true;
        if (temDinheiro && temCartao) {
            System.out.println("Pede um ifood e um Zé delivery");
        } else if (temDinheiro || temCartao) {
            System.out.println("Pede um ifood");
        } else {
            System.out.println("Não pede nada");
        }
    }
}
