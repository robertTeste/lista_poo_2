package principal;

import heranca.Aluno;
import heranca.Professor;
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Executando Lista de POO ===\n");

        Aluno aluno = new Aluno("Robert", 19, "2026001F");

        Professor professor = new Professor("Diego Alves", 35, "Programação Orientada a Objetos");

        System.out.println("--- Apresentação do Aluno ---");
        aluno.apresentar();

        System.out.println("\n--- Apresentação do Professor ---");
        professor.apresentar();

        /*
         Tanto 'aluno' quanto 'professor' conseguem chamar o método apresentar() porque ambos SÃO uma extensão de Pessoa. O código do método foi escrito
         uma única vez na classe pai e reaproveitado integralmente pelas classes filhas, evitando a duplicação de lógica no projeto.
         */
    }
}