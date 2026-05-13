package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_07a_composicao;

public class Carro {
    private Motor motor;

    public Carro() {
        this.motor = motor;
    }

    public Carro(int cilindradas) {
        this.motor = new Motor(cilindradas);
    }

    public void mostrarCilindradas() {
        System.out.println("Carro com motor de " + motor.getCilindradas() + " cilindradas.");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
