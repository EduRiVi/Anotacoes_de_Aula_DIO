import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ArcoIrisSet {
    
    public static void main(String[] args) {

        Set<String> coresLinkSet = new LinkedHashSet<>(Arrays.asList(
            "Azul",
            "Vermelho",
            "Verde",
            "Amarelo",
            "Laranja",
            "Violeta",
            "Anil"
        ));

        System.out.println("Crie uma conjunto contendo as cores do arco-íris");
        Set<String> cores = new HashSet<>(coresLinkSet);
        System.out.println(cores);

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra");
        cores.forEach(System.out::println);
        
        System.out.println("A quantidade de cores que o arco-íris tem: "+ cores.size());

        System.out.println("Exiba as cores em ordem alfabética");
        Set<String> coresTreeSet = new TreeSet<>(cores);
        System.out.println(coresTreeSet);

        System.out.println("Exiba as cores na ordem inversa da que foi informada");
        System.out.println(coresLinkSet);
        System.out.println(List.of(coresLinkSet.toArray(String[]::new)).reversed());

        System.out.println("Exiba todas as cores que começam com a letra 'v'");

        cores.stream().filter(cor -> cor.startsWith("v")).forEach(System.out::println);
                                        
        System.out.println("Remova todas as cores que não começam com a letra 'v'");
        cores.removeIf(cor -> !cor.startsWith("v"));
        System.out.println(cores);

        cores.clear();
        System.out.println(cores);
        System.out.println("Confira se o conjunto está vazio: "+ cores.isEmpty());
    }
}