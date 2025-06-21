package classes_resources;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    String nome;
    Integer anoDeCriacao;
    String IDE;

    public LinguagemFavorita (String nome, Integer anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;

    }

    public String getNome(){
        return nome;
    }

    public Integer getAnoDeCriacao(){
        return anoDeCriacao;
    }

    public String getIDE(){
        return IDE;
    }

    @Override
    public String toString() {
        
        return "["
                + nome +", "
                + anoDeCriacao +", "
                + IDE 
                +"]";
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.getNome().compareTo(linguagem.getNome());
    }
}