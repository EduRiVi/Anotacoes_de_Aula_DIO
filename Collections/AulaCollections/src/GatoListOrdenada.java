/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes_resources.ComparatorCor;
import classes_resources.ComparatorIdade;
import classes_resources.ComparatorNomeCorIdade;
import classes_resources.Gato;

public class GatoListOrdenada {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem Idade\t---");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
        
    }
}