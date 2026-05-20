package principal;

import polimorfismo.Animal;
import polimorfismo.Cachorro;
import polimorfismo.Gato;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===");

        /*
         Declaramos as variáveis usando o tipo abstrato/genérico 'Animal'.
         Porém, instanciamos objetos concretos 'Cachorro' e 'Gato'.
         */
        Animal animal1 = new Cachorro("Rex");
        Animal animal2 = new Gato("Mimi");

        System.out.println("--- Testando Polimorfismo ---");

        /*
        Na compilação, o Java apenas sabe que 'animal1' e 'animal2' são Animais.
        Em tempo de execução, o Java descobre qual é o tipo REAL do objeto na memória e direciona a execução para o método @Override correto.
         */
        animal1.emitirSom(); // Saída no console: Rex: Au au!
        animal2.emitirSom(); // Saída no console: Mimi: Miau!
    }
}