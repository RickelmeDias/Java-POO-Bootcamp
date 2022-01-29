package dev.rickelmedias.desafio.dominio;

import java.time.LocalDate;

public class Curso extends ConteudoBootcamp {
    private int cargaHoraria;

    public Curso (String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public double getXP() { return calcularXP(); }

    @Override
    protected double calcularXP() {
        return XP_PADRAO + (cargaHoraria * 0.01);
    }

    @Override
    public String toString() {
        return (
                "Titulo Curso: " + this.getTitulo() + "\n" +
                "Descricao Curso: " + this.getDescricao() + "\n" +
                "Carga Horaria Curso: " + this.getCargaHoraria() + " horas" + "\n" +
                "XP do Curso: " + this.getXP()
        );
    }
}
