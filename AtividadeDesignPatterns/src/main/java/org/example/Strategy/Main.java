package org.example.Strategy;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso(1, "Analise e Desenvolvimento de Sistemas", "Prof. Henrique");
        Curso curso2 = new Curso(2, "Engenharia de Software", "Prof. Carlos");

        Aluno aluno1 = new Aluno("Gabriel", "12345", curso1);
        Aluno aluno2 = new Aluno("Luiz", "67890", curso2);

        MatriculaService matricula1 = new MatriculaService(new Matricula());
        matricula1.realizarMatricula(aluno1);

        MatriculaService matricula2 = new MatriculaService(new Matricula());
        matricula2.realizarMatricula(aluno2);
    }
}