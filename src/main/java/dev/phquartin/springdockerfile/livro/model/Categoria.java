package dev.phquartin.springdockerfile.livro.model;

public enum Categoria {
    ROMANCE("Romance"),
    FANTASIA("Fantasia"),
    TERROR("Terror"),
    FICCAO("Ficção"),
    MISTERIO("Mistério"),
    SUSPENSE("Suspense"),
    BIOGRAFIA("Biografia"),
    HISTORIA("História"),
    CIENCIA("Ciência");

    private final String nome;

    Categoria(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
