/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import classes_resources.Gato;

public class GatoSimplificado {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(Arrays.asList(
            new Gato("Jon", 12, "preto"),
            new Gato("Simba", 6, "tigrado"),
            new Gato("Jon", 18, "amarelo")
        ));

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem Idade\t---");
        meusGatos.sort(Comparator.comparing(Gato::getIdade));
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem cor\t---");
        meusGatos.sort(Comparator.comparing(Gato::getCor));
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort((g1, g2) -> {
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if(nome != 0) return nome;
            
            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if (cor != 0) return cor;

            return g1.getIdade().compareTo(g2.getIdade());
        });
        System.out.println(meusGatos);
        
    }
}