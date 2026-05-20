package abstratas;

public class ContaPoupanca extends Conta {

    @Override
    public void sacar(double valor) {
        /*
         A conta poupança só permite o saque se houver saldo suficiente.
         */
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("[ALERTA] Saque recusado na Poupança: Saldo insuficiente!");
        }
    }
}