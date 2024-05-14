package org.example.Adapter;

public class MatriculaAdapter implements Matricula {
    private MatriculaCurso matriculaCurso;

    public MatriculaAdapter(MatriculaCurso matriculaCurso) {
        this.matriculaCurso = matriculaCurso;
    }

    public void matricularAluno(Aluno aluno) {
        matriculaCurso.matricularAluno(aluno);
    }
}
