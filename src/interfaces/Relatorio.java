package interfaces;

    /* Usamos a palavra-chave 'implements' para assinar o contrato da interface.
     A classe é obrigada a fornecer o corpo do método imprimir().
     */
public class Relatorio implements Imprimivel {

    @Override
    public void imprimir() {
        System.out.println("[IMPRIMINDO] Gerando páginas do Relatório Mensal de Vendas...");
    }
}