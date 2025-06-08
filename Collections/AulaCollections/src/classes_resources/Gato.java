package classes_resources;

public class Gato implements Comparable<Gato>{

    String nome;
    Integer idade;
    String cor;

    public Gato (String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;

    }

    public String getNome(){
        return nome;
    }

    public String getCor(){
        return cor;
    }

    public Integer getIdade(){
        return idade;
    }

    @Override
    public String toString() {

        return "{" + "nome = " + nome 
                + ", idade = " + idade
                + ", cor = " + cor
                + "}";
    }

    @Override
    public int compareTo(Gato g) {
        return this.getNome().compareToIgnoreCase(g.getNome());
    }
    
}