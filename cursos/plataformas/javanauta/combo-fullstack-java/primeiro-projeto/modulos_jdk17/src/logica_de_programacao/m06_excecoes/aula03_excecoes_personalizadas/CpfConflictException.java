package logica_de_programacao.m06_excecoes.aula03_excecoes_personalizadas;

public class CpfConflictException extends RuntimeException {
    public CpfConflictException(String message) {
        super(message);
    }

    public CpfConflictException(String message, Throwable cause) {
        super(message, cause);
    }
}
