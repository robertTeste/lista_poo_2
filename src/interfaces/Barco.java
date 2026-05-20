package interfaces;

public class Barco implements Navegavel {

    @Override
    public void navegar() {
        System.out.println("[BARCO] O barco está navegando pelos mares usando seus motores.");
    }
}