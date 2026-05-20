package principal;

// Importando os utilitários de lista do Java
import java.util.ArrayList;
import java.util.List;

// Importando as classes de formas do seu pacote abstratas
import abstratas.Forma;
import abstratas.Circulo;
import abstratas.Retangulo;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===\n");

        /*
         *
         * Criamos um ArrayList que armazena referências do tipo genérico 'Forma'.
         */
        List<Forma> listaFormas = new ArrayList<>();

        listaFormas.add(new Circulo(2.5));
        listaFormas.add(new Retangulo(4.0, 5.0));
        listaFormas.add(new Circulo(5.0));

        System.out.println("--- Calculando Áreas Polimorficamente ---");

        /*
         * O grande objetivo do exercício: UM único laço 'for' consegue calcular
         * a área de qualquer objeto da lista, disparando o cálculo correto de
         * cada figura geométrica em tempo de execução.
         */
        for (Forma forma : listaFormas) {
            System.out.println("Área da forma: " + forma.calcularArea());
        }
    }
}