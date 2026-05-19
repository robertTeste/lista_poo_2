package wrappers;

import java.math.BigDecimal;

public class Exercicio04 {

    public void executar() {
        System.out.println("--- Executando Exercício 4 ---");

        BigDecimal precoUnitario = new BigDecimal("49.90");
        BigDecimal quantidade = new BigDecimal("3");

        /*Se o desconto é de 5%, o cliente vai pagar 95% do valor total.
         Representamos 95% como "0.95" em formato decimal.
         */
        BigDecimal fatorPagar = new BigDecimal("0.95");

        BigDecimal totalSemDesconto = precoUnitario.multiply(quantidade);
        BigDecimal totalComDesconto = totalSemDesconto.multiply(fatorPagar);

        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total com 5% de desconto: R$ " + totalComDesconto);

        /*
         === POR QUE USAR BIGDECIMAL E NÃO DOUBLE? ===

         1. Tipos primitivos flutuantes (como double e float) trabalham com representação binária baseada na norma IEEE 754. Isso causa imprecisões de arredondamento
         em contas decimais simples (ex: 0.1 + 0.2 pode resultar em 0.30000000000000004).

         2. Em sistemas comerciais, financeiros ou fiscais, perder centavos ou fraçõe por imprecisão gera erros graves de caixa. O BigDecimal garante precisão absoluta.

         3.IMPORTANTE: Sempre usamos o construtor que recebe String (new BigDecimal("49.90")).
         Se usássemos o construtor numérico (new BigDecimal(49.90)), o Java passaria um valor
         double já impreciso para dentro dele, quebrando o propósito da classe.
         */
    }
}