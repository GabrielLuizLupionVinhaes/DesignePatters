package org.example.FactoryMethod;

class Aluno {
    private String nome;
    private String RA;
    private Curso curso;

    public Aluno(String nome, String RA, Curso curso) {
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    public Curso getCurso() {
        return curso;
    }
}
