package classes_resources;

import java.util.Comparator;

public class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita> {
    
    @Override
    public int compare(LinguagemFavorita g1, LinguagemFavorita g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int ano = g1.getAnoDeCriacao().compareTo(g2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return g1.getIDE().compareToIgnoreCase(g2.getIDE());
    }
}