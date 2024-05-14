package org.example.Strategy;

public class MatriculaService {
    private MatriculaStrategy matriculaStrategy;

    public MatriculaService(MatriculaStrategy matriculaStrategy) {
        this.matriculaStrategy = matriculaStrategy;
    }

    public void realizarMatricula(Aluno aluno) {
        matriculaStrategy.realizarMatricula(aluno);
    }
}
