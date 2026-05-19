package principal;

import wrappers.Exercicio01;
import wrappers.Exercicio02; // Importando o novo exercício

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===");

        /* Se quiser rodar o exercício 1:
        Exercicio01 ex1 = new Exercicio01();
        ex1.executar();*/

        System.out.println("----------------------------------------");

        Exercicio02 ex2 = new Exercicio02();
        ex2.executar();
    }
}