import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import classes_resources.ComparatorAnoNome;
import classes_resources.ComparatorIDE;
import classes_resources.ComparatorNomeAnoIDE;
import classes_resources.LinguagemFavorita;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class LinguagensFavoritasSet {
    
    public static void main(String[] args) {

        System.out.println("Crie um conjunto com 3 linguagens");
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(Arrays.asList(
            new LinguagemFavorita("Java", 1991, "Android Studio"),
            new LinguagemFavorita("Python", 1991, "VS Code"),
            new LinguagemFavorita("C++", 1979, "Android Studio")
        ));
        
        System.out.println("Ordem de inserção");
        System.out.println(linguagens);

        System.out.println("Ordem natural(nome)");
        Set<LinguagemFavorita> linguagensTree = new TreeSet<>(linguagens);
        System.out.println(linguagensTree);

        System.out.println("Ordene por IDE");
        Set<LinguagemFavorita> linguagensTree4IDE = new TreeSet<>(new ComparatorIDE());
        linguagensTree4IDE.addAll(linguagens);
        System.out.println(linguagensTree4IDE);
        
        System.out.println("Ordene por ano de criação e nome");
        Set<LinguagemFavorita> linguagensTree4AnoNome = new TreeSet<>(new ComparatorAnoNome());
        linguagensTree4AnoNome.addAll(linguagens);
        System.out.println(linguagensTree4AnoNome);

        System.out.println("Ordene por nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagensTree4NomeAnoIDE = new TreeSet<>(new ComparatorNomeAnoIDE());
        linguagensTree4NomeAnoIDE.addAll(linguagens);
        System.out.println(linguagensTree4NomeAnoIDE);

        System.out.println("Exiba as linguagens no console, um abaixo da outra");
        linguagensTree4NomeAnoIDE.forEach(System.out::println);

    }
}