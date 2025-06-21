import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LancamentoDadoMap {
    
    public static void main(String[] args) {
        int jogadas = 100;
        Map<Integer, Integer> valoresDado = new HashMap<>();

        for (int i=1; i<=6; i++) valoresDado.put(i, 0);
        
        System.out.println("Lançando dado: "+jogadas+" jogadas...");
        
        Random random = new Random();
        for (int i=0; i<jogadas; i++){
            Integer lancamento = random.nextInt(1, 7);
            valoresDado.replace(lancamento, valoresDado.get(lancamento)+1);
        }

        valoresDado.forEach((k, v) -> System.out.println("Número "+k+": "+v+" vezes"));
    }
}