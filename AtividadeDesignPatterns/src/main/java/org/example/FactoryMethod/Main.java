package org.example.FactoryMethod;


import org.example.Strategy.Aluno;
import org.example.Strategy.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new org.example.Strategy.Curso(1, "Analise e Desenvolvimento de Sistemas", "Prof. Henrique");
        Curso curso2 = new Curso(2, "Engenharia de Software", "Prof. Carlos");

        Aluno aluno1 = new org.example.Strategy.Aluno("Lupion", "12345", curso1);
        Aluno aluno2 = new Aluno("Vinhaes", "67890", curso2);

        System.out.println("Aluno: " + aluno1.getNome() + "\nCurso: " + aluno1.getCurso().getNome()+"\n");
        System.out.println("Aluno: " + aluno2.getNome() + "\nCurso: " + aluno2.getCurso().getNome());
    }
}
