package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_08_abstracao;

public class Cliente extends Endereco implements Pessoa {
    private String nome;
    private String documento;

    public Cliente(String rua, String cidade, String estado, String cep, String nome, String documento) {
        super(rua, cidade, estado, cep);
        this.nome = nome;
        this.documento = documento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }

    public void mostrarEndereco() {
        System.out.println("Endereço do cliente: rua: " + getRua() + ", cidade: " + getCidade() + ", estado " + getEstado() + ", cep: " + getCep());
    }
}
