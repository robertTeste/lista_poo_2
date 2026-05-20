package principal;

import java.util.ArrayList;
import java.util.List;

import polimorfismo.Animal;
import polimorfismo.Cachorro;
import polimorfismo.Gato;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===");

        /*
         Criamos um ArrayList que aceita QUALQUER objeto que seja um 'Animal'.
         Usamos a interface List na declaração (boa prática de POO).
         */
        List<Animal> listaAnimais = new ArrayList<>();

        listaAnimais.add(new Cachorro("Rex"));
        listaAnimais.add(new Gato("Mimi"));
        listaAnimais.add(new Cachorro("Thor"));
        listaAnimais.add(new Gato("Garfield"));

        System.out.println("--- Percorrendo a Lista com For-Each ---");

        /*
         O laço for-each passa por cada item da lista.
         A variável temporária 'animal' trata todos de forma genérica.
         */
        for (Animal animal : listaAnimais) {
            animal.emitirSom();
        }

        /*
         Repare que o laço 'for' não faz nenhuma validação do tipo:
         "se for cachorro, faz auau; se for gato, faz miau". Se amanhã você criar uma classe 'Passaro' que estende Animal, basta adicioná-la
         na lista e este 'for' continuará funcionando perfeitamente sem mudar uma única linha!
         */
    }
}