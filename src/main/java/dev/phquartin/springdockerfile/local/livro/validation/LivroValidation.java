package dev.phquartin.springdockerfile.local.livro.validation;

import dev.phquartin.springdockerfile.local.livro.model.Livro;

public class LivroValidation {

    public static void validate(Livro livro) {

        if(livro.getAutor() == null) throw new LivroException("Livro precisa de um Autor");
        if (livro.getCategoria() == null) throw new LivroException("Livro precisa de uma Categoria");
        if (livro.getTitulo().isBlank() || livro.getTitulo().isEmpty()) throw new LivroException("Titulo nulo ou em branco");
        if (livro.getTitulo().matches("^[A-Za-z]+(?:[A-Za-z0-9 ]*)$")) throw new LivroException("Titulo deve conter letras");

    }

}
