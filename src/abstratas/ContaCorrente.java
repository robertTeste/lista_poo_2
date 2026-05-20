package abstratas;

public class ContaCorrente extends Conta {

    @Override
    public void sacar(double valor) {
        /*
        A conta corrente permite que o saldo fique negativo. ubtraímos diretamente do saldo (que é protected na classe pai).
         */
        this.saldo -= valor;
    }
}