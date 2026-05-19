package principal;

import heranca.Cachorro;
import heranca.Gato;
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===");

        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");

        System.out.println("--- Testando os Sons dos Animais ---");
        cachorro.emitirSom(); // Deve imprimir "Rex: Au au!"
        gato.emitirSom();     // Deve imprimir "Mimi: Miau!"
    }
}