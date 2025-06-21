package classes_resources;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita> {
    
    @Override
    public int compare(LinguagemFavorita g1, LinguagemFavorita g2) {
        return g1.getIDE().compareToIgnoreCase(g2.getIDE());
    }
}