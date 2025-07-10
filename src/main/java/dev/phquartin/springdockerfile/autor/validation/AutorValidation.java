package dev.phquartin.springdockerfile.autor.validation;

import dev.phquartin.springdockerfile.autor.model.Autor;

public class AutorValidation {
    
    public static void validate(Autor autor) {
        
        if (autor.getNome().isBlank() || autor.getNome().isEmpty()) throw new AutorException("Nome nulo ou em branco");
        if (autor.getNome().matches("^[A-Za-z]+(?:[ A-Za-z.]+)*$")) throw new AutorException("Nome deve conter apenas letras");
        
    }
    
}
