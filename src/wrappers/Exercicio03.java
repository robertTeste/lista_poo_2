package wrappers;

public class Exercicio03 {

    public void executar() {
        System.out.println("--- Executando Exercício 3 ---");

        Integer num1 = 127; // [cite: 13]
        Integer num2 = 127; // [cite: 13]
        System.out.println("127 == 127 ? " + (num1 == num2)); // Retorna true [cite: 82]

        Integer num3 = 200; // [cite: 14]
        Integer num4 = 200; // [cite: 14]
        System.out.println("200 == 200 ? " + (num3 == num4)); // Retorna false [cite: 84]
        System.out.println("200.equals(200) ? " + num3.equals(num4)); // Retorna true [cite: 84]

        /*
         1. Operador '==': Em objetos, ele compara a REFERÊNCIA (o endereço de memória)[cite: 84].
         2. Integer Cache: A JVM possui uma otimização que armazena em cache objetos
          Integer com valores de -128 a 127[cite: 82]. Ao declarar 127, 'num1' e 'num2'
          apontam para a mesma instância no cache, resultando em 'true'[cite: 82].
          3. Valores fora do Cache: Para o valor 200, a JVM é obrigada a instanciar dois
          objetos totalmente novos e distintos em posições de memória diferentes[cite: 84].
          Logo, 'num3 == num4' falha (false)[cite: 84].
         4. Método '.equals()': Sobrescreve o comportamento padrão para ignorar os
          endereços de memória e comparar o CONTEÚDO real (o valor numérico)[cite: 84].
         */
    }
}