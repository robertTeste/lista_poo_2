package principal;

import abstratas.Circulo;
import abstratas.Retangulo;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===");

        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 3.0);

        System.out.println("--- Área do Círculo ---");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área calculada: " + circulo.calcularArea());

        System.out.println("----------------------------------------");

        System.out.println("--- Área do Retângulo ---");
        System.out.println("Dimensões: " + retangulo.getLargura() + "x" + retangulo.getAltura());
        System.out.println("Área calculada: " + retangulo.calcularArea());

        /*
         Se você tentar fazer:Forma f = new Forma();
         O Java vai acusar um erro de compilação imediatamente. Classes abstratas servem apenas como moldes conceituais e não podem ser instanciadas diretamente.
         */
    }
}