package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_08_abstracao;

public class Funcionario extends Endereco implements Pessoa{
private String nome;
private String documento;
private String cargo;

    public Funcionario(String rua, String cidade, String numero, String estado, String cep, String nome, String documento, String cargo) {
        super(rua, cidade, numero, estado, cep);
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    public void mostrarEndereco() {
        System.out.println("Endereço do cliente: rua: " + getRua() + ", numero: " + getNumero() + ", cidade: " + getCidade() + ", estado " + getEstado() + ", cep: " + getCep());
    }
}
