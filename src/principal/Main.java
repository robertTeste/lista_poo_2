package principal;

import wrappers.Exercicio01;
import wrappers.Exercicio02;
import wrappers.Exercicio03; // Importação do novo exercício

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===\n");

        /*Se quiser rodar os anteriores novamente, basta remover as duas barras (//)
        Exercicio01 ex1 = new Exercicio01();
        ex1.executar();*/

        /*Exercicio02 ex2 = new Exercicio02();
        ex2.executar();*/

        Exercicio03 ex3 = new Exercicio03();
        ex3.executar();
    }
}