package dev.phquartin.springdockerfile.local.livro.model;

import dev.phquartin.springdockerfile.local.autor.model.Autor;
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

    public Livro() {
    }

    public Livro(Long id, String titulo, Autor autor, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
