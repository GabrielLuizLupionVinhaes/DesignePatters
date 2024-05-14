package org.example.Strategy;

public class Curso {
    private int codigoDoCurso;
    private String nome;
    private String coordenador;

    public Curso(int codigoDoCurso, String nome, String coordenador) {
        this.codigoDoCurso = codigoDoCurso;
        this.nome = nome;
        this.coordenador = coordenador;
    }

    public int getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public String getNome() {
        return nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

}
