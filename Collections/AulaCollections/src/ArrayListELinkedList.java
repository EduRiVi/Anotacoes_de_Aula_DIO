import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListELinkedList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.addAll(Arrays.asList(3.0, 0.0, 5.0, 6.3, 8.2, 4.6));

        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);

        System.out.println("Confira se a nota 5.0 está na lista: "+ notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: " + notas);

        System.out.println("Exiba a terceira nota adicionada: "+ notas.get(2));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        
        Iterator<Double> iterator = notas.iterator();
        Double soma =  0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println(soma);

        System.out.println("Exiba a média das notas: "+soma/notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
 
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        
        System.out.println(notas);
        iterator = notas.iterator();
        while (iterator.hasNext()) {
            if(iterator.next() < 7d) iterator.remove();
        }
        
        System.out.println(notas);
    
        System.out.println("Apague toda a lista");
        notas.clear();
  
        System.out.println("Confira se a lista está vazia: "+ notas.isEmpty());

        notas = Arrays.asList(3.0, 0.0, 5.0, 6.3, 8.2, 4.6);

/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
*/

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
            List<Double> notas2 = new LinkedList<>();
            notas2.addAll(notas);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: "+ notas2.getFirst());

        System.out.println("Mostre a primeira nota da nova lista removendo-o: "+notas2.removeFirst());
        System.out.println(notas2);
    }
}
