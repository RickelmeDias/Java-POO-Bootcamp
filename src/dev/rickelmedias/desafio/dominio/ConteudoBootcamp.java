package dev.rickelmedias.desafio.dominio;

public abstract class ConteudoBootcamp {
    private String titulo;
    private String descricao;
    protected static final double XP_PADRAO = 10d;

    ConteudoBootcamp (String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    protected double calcularXP() {
        return XP_PADRAO;
    }
}
