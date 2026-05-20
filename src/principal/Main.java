package principal;

import abstratas.ContaCorrente;
import abstratas.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===");

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100.0);
        cc.sacar(150.0);

        System.out.println("--- Saldo Conta Corrente ---");
        System.out.println("Saldo atual: R$ " + cc.getSaldo());

        System.out.println("----------------------------------------");

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.depositar(100.0);
        poupanca.sacar(150.0);

        System.out.println("--- Saldo Conta Poupança ---");
        System.out.println("Saldo atual: R$ " + poupanca.getSaldo());
    }
}