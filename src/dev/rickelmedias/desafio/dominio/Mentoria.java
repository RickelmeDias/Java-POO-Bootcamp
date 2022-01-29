package dev.rickelmedias.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends ConteudoBootcamp {
    private LocalDate data;

    public Mentoria (String titulo, String descricao) {
        super(titulo, descricao);
        this.data = LocalDate.now();
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return (
                "Titulo Mentoria: " + this.getTitulo() + "\n" +
                "Descricao Mentoria: " + this.getDescricao() + "\n" +
                "Data Mentoria: " + this.getData()
                );
    }
}
