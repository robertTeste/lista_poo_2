package principal;

import heranca.Carro;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===\n");

        Carro meuCarro = new Carro("Toyota", 2024, 4);

        meuCarro.ligar();

        System.out.println("Número de portas do carro: " + meuCarro.getNumPortas());
    }
}