import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LancamentoDadoMap {
    
    public static void main(String[] args) {
        int jogadas = 100;
        Map<Integer, Integer> valoresDado = new HashMap<>();

        System.out.println("Lançando dado: "+jogadas+" jogadas...");
        
        Random random = new Random();
        for (int i=0; i<jogadas; i++){
            Integer lancamento = random.nextInt(1, 7);
            valoresDado.compute(lancamento, (k, v) -> v == null ? 1 : ++v);
        }

        valoresDado.forEach((k, v) -> System.out.println("Número "+k+": "+v+" vezes"));
    }
}