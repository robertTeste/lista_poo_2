package heranca;

public class Gerente extends Funcionario {

    // O construtor do Gerente repassa os parâmetros para a classe pai (Funcionario)
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    /*
     Usamos o @Override para redefinir o comportamento de calcularBonus(). Como o bônus do Gerente é de 20%, alteramos a fórmula.
     Nota: Usamos getSalario() porque o atributo 'salario' é privado na classe pai.
     */
    @Override
    public double calcularBonus() {
        return getSalario() * 0.20;
    }
}