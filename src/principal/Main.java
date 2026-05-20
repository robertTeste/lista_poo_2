package principal;

import interfaces.Imprimivel;
import interfaces.Contrato;
import interfaces.Relatorio;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===");

        Contrato meuContrato = new Contrato();
        Relatorio meuRelatorio = new Relatorio();

        System.out.println("--- Testando o Exercício 17 ---");

        /*
         * Chamamos o mesmo método estático passando objetos de classes diferentes.
         * O polimorfismo de interface entra em ação aqui!
         */
        imprimirDocumento(meuContrato);  // Passando o seu Contrato
        imprimirDocumento(meuRelatorio); // Passando o Relatório
    }

    /*
     * Este método recebe qualquer objeto cujo tipo implemente a interface 'Imprimivel'.
     * Ele não precisa saber se é um Contrato ou um Relatório, apenas chama o método do contrato.
     */
    public static void imprimirDocumento(Imprimivel doc) {
        // O Java descobre o tipo real em tempo de execução e roda o @Override correto
        doc.imprimir();
    }
}