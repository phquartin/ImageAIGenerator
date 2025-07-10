package dev.phquartin.springdockerfile.local.autor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.phquartin.springdockerfile.local.livro.model.Livro;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "nome")
    private String nome;

    @OneToMany(mappedBy = "autor")
    @JsonIgnoreProperties("autor")
    private List<Livro> livros;

    public Autor() {
    }

    public Autor(Long id, String nome, List<Livro> livros) {
        this.id = id;
        this.nome = nome;
        this.livros = livros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
