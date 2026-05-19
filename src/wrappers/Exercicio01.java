package wrappers;

public class Exercicio01 {
    public void executar() {
        int nota = 8;
        Integer notaObj = nota;

        System.out.println("Nota primitiva: " + nota);
        System.out.println("Nota objeto: " + notaObj);
        System.out.println("Tipo: " + notaObj.getClass().getSimpleName());
    }
}
