package principal;
import abstratas.Carro;
import abstratas.Moto;
import abstratas.Veiculo;
public class Main {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaMoto = new Moto();

        meuCarro.buzinar();
        minhaMoto.buzinar();

        /*TESTE DO EXERCÍCIO: Tente descommentar a linha abaixo para ver o que acontece:
        Veiculo meuVeiculo = new Veiculo();
        O IntelliJ vai dar um erro de compilação dizendo: 'Veiculo' is abstract; cannot be instantiated*/
    }
}