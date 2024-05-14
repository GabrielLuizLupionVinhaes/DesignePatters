package org.example.Adapter;

public class MatriculaCurso implements Matricula {
    public void matricularAluno(Aluno aluno) {
        System.out.println("Aluno: " + aluno.getNome() + "Curso: " + aluno.getCurso().getNome() + "\n");
    }
}
