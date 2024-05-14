package org.example.Strategy;

public class Matricula implements MatriculaStrategy {
    public void realizarMatricula(Aluno aluno) {
        System.out.println("Aluno: " + aluno.getNome() + "\nCurso: " + aluno.getCurso().getNome() + "\n");
    }
}
