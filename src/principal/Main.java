package principal;

import interfaces.Contrato;
import interfaces.Relatorio;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===\n");

        Relatorio relatorio = new Relatorio();
        Contrato contrato = new Contrato();

        System.out.println("--- Testando as Implementações da Interface ---");
        relatorio.imprimir();
        contrato.imprimir();

        /*
         Diferente da herança de classes (onde uma classe só pode herdar de UMA classe pai), no Java uma classe pode implementar MÚLTIPLAS interfaces ao mesmo tempo.
         Isso traz uma flexibilidade enorme para o design do seu código.
         */
    }
}