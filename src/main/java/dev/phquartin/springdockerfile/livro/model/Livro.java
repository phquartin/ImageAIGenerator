package dev.phquartin.springdockerfile.livro.model;

import dev.phquartin.springdockerfile.autor.model.Autor;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "titulo")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    @JoinColumn(nullable = false)
    private Autor autor;

    @Column(nullable = false, name = "categoria")
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

}
