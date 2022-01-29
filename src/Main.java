import dev.rickelmedias.desafio.dominio.Bootcamp;
import dev.rickelmedias.desafio.dominio.Curso;
import dev.rickelmedias.desafio.dominio.Dev;
import dev.rickelmedias.desafio.dominio.Mentoria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bootcamp bcJava = new Bootcamp();
        bcJava.setNome("Bootcamp Java");
        bcJava.setDescricao("Aprendendo tudo sobre java!");
        bcJava.getConteudos().add(new Curso("GIT e GITHUB", "Aprenda Git", 90));
        bcJava.getConteudos().add(new Curso("POO Java", "POO Java", 390));
        bcJava.getConteudos().add(new Mentoria("Java para aprender", "Aprenda definitivamente"));

        Dev devRick = new Dev();
        devRick.setNome("Rickelme Dias");
        print("Conteudos inscritos: " + devRick.getConteudosInscritos());

        Dev devJonny = new Dev();
        devJonny.setNome("Jonny Jon");
        print("Conteudos inscritos: " + devJonny.getConteudosInscritos());

        devRick.inscreverBootcamp(bcJava);
        print("==================");
        print("Conteudos inscritos: " + devRick.getConteudosInscritos());
        print("==================");
        print("Conteudos concluidos: " + devRick.getConteudosConcluidos());
        print("==================");
        devRick.progredir();
        print("Conteudos concluidos: " + devRick.getConteudosConcluidos());
        print("==================");
    }

    public static void print(String str){
        System.out.println(str);
    }
}
