package org.example.FactoryMethod;

public class CursoFactory {
    public static Curso criarCurso(int codigoDoCurso, String nome, String coordenador) {
        return new Curso(codigoDoCurso, nome, coordenador);
    }
}
