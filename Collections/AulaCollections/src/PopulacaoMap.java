import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class PopulacaoMap {
    
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacoesLink = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacoesLink);

        Map<String, Integer> populacoesHash = new HashMap<>(populacoesLink);
        
        populacoesLink.replace("RN", 3534165);
        System.out.println(populacoesLink);

        if (!populacoesLink.containsKey("PB")) populacoesLink.put("PB", 4039277);
        
        System.out.println(populacoesLink.get("PE"));

        System.out.println(populacoesLink);

        Map<String, Integer> populacoesTree = new TreeMap<>(populacoesLink);
        System.out.println(populacoesTree);

        System.out.println("Estado(s) com maior populações: ");
        Map.Entry<String, Integer> maiorPopulacao = Map.entry("", 0);
        Map.Entry<String, Integer> menorPopulacao = Map.entry("", 0);
        
        for (Map.Entry<String, Integer> estado : populacoesLink.entrySet()) {
            if (estado.getValue().equals(Collections.max(populacoesLink.values()))) 
                maiorPopulacao = estado;
            else if (estado.getValue().equals(Collections.min(populacoesLink.values())))
                menorPopulacao = estado;
        }
        System.out.println(maiorPopulacao.getKey() +" - "+ maiorPopulacao.getValue());
        System.out.println(menorPopulacao.getKey() +" - "+ menorPopulacao.getValue());
        
        System.out.println("Soma das populações: "+ populacoesLink.values()
                                                                .stream()
                                                                .mapToInt(Integer::intValue)
                                                                .sum());
        
        System.out.println("Média das populações: "+ populacoesLink.values()
                                                                .stream()
                                                                .mapToInt(Integer::intValue)
                                                                .average()
                                                                .orElse(0d));

        Iterator<Integer> iterator = populacoesLink.values().iterator();
        while (iterator.hasNext()) {
            if(iterator.next() < 4000000) iterator.remove();
        }
        System.out.println(populacoesLink);

        populacoesLink.clear();

        System.out.println("Verifique se o Map esta vazio: "+ populacoesLink.isEmpty());

    }
}