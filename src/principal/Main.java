package principal;

import heranca.Funcionario;
import heranca.Gerente;
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===");

        Funcionario func = new Funcionario("João Silva", 3000.0);
        Gerente ger = new Gerente("Robert", 8000.0);

        System.out.println("--- Dados do Funcionário ---");
        System.out.println("Nome: " + func.getNome());
        System.out.println("Salário: R$ " + func.getSalario());
        System.out.println("Bônus (10%): R$ " + func.calcularBonus());

        System.out.println("----------------------------------------");

        System.out.println("--- Dados do Gerente ---");
        System.out.println("Nome: " + ger.getNome());
        System.out.println("Salário: R$ " + ger.getSalario());
        System.out.println("Bônus Sobrescrito (20%): R$ " + ger.calcularBonus());
    }
}