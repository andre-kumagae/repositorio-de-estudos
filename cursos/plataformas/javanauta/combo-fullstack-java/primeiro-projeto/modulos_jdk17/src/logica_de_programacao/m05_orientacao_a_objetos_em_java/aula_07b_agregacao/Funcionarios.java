package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_07b_agregacao;

public class Funcionarios {
    private String nome;

    public Funcionarios(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " Funcionarios { " +
                "nome = '" + nome + '\'' + " " +
                '}';
    }
}
