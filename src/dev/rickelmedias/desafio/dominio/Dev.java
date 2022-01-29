package dev.rickelmedias.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<ConteudoBootcamp> conteudosInscritos = new LinkedHashSet<>();
    private Set<ConteudoBootcamp> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void progredir() {
        Optional<ConteudoBootcamp> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Voce nao esta inscrito em nenhum conteudo.");
        }
    }

    public double calcularTotalXP() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(ConteudoBootcamp::calcularXP)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public Set<ConteudoBootcamp> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public Set<ConteudoBootcamp> getConteudosInscritos() {
        return conteudosInscritos;
    }

    // Setters

    public void setConteudosConcluidos(Set<ConteudoBootcamp> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void setConteudosInscritos(Set<ConteudoBootcamp> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
