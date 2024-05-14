package org.example.Adapter;

import org.example.Adapter.Aluno;
import org.example.Adapter.Curso;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso(1, "Analise e Desenvolvimento de Sistemas", "Prof. Henrique");
        Curso curso2 = new Curso(2, "Engenharia de Software", "Prof. Carlos");

        Aluno aluno1 = new Aluno("Gabriel", "12345", curso1);
        Aluno aluno2 = new Aluno("Vinhaes", "67890", curso2);


        MatriculaCurso matricula = new MatriculaCurso();
        matricula.matricularAluno(aluno1);

        MatriculaAdapter matricula2 = new MatriculaAdapter(matriculaCurso);
        matricula2.matricularAluno(aluno2);
    }
}
