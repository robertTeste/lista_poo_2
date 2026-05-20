package principal;

import interfaces.Barco;
import interfaces.Peixe;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===");

        Barco meuBarco = new Barco();
        Peixe meuPeixe = new Peixe();

        System.out.println("--- Testando a Interface Navegavel ---");
        meuBarco.navegar();
        meuPeixe.navegar();

        /*
         Repare que 'Barco' (um objeto mecânico) e 'Peixe' (um animal) não possuem nenhuma relação de parentesco por herança (não faria sentido herdar da mesma classe).
         No entanto, ambos compartilham o COMPORTAMENTO de navegar. A interface serve exatamente para isso: unir classes totalmente diferentes através de uma ação comum.
         */
    }
}