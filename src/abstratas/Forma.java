package abstratas;

public abstract class Forma {

    /*
     Um método abstrato não possui corpo (não tem as chaves { ... }). Ele serve como um "contrato" obrigatório: qualquer classe filha concreta
     que estender 'Forma' será forçada a fornecer sua própria implementação matemática para calcular a área.
     */
    public abstract double calcularArea();
}