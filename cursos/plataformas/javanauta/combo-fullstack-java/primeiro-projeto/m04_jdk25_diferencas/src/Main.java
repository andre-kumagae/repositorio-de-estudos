// importar por módulos em vez de pacotes individuais
import module java.base;
import static java.lang.IO.println;

// Não precisa declara o nome da classe

// Declaramos main apenas com o retorno void

void main() {
    println("Olá, mundo");
    testeSwitch();

    var nomes = List.of("Ana", "Bruno", "Carla");
    var idades = Map.of("Ana", 25, "Bruno", 22, "Carla", 18);
    var agora = LocalDateTime.now();
    System.out.printf("Nomes: %s\nIdades: %s\nData e Hora atual: %s",nomes,idades,agora);
}

// utilizar switch case com condicionais
void testeSwitch() {
    int numero = 8;
    String resultado = switch (numero) {
        case int n when n > 0 && n <= 3 -> "pequeno";
        case int n when n > 3 && n <= 7 -> "médio";
        case int n when n > 7 -> "grande";
        default -> "zero";
    };
    System.out.println(resultado);
}