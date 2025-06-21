import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;

public class MediaTemperaturaSemestral {
    public static void main(String[] args) {
        
        List<Double> temperaturasMedias = new ArrayList<>();
        
        List<Map.Entry<String, Integer>> av = new ArrayList<>(new GregorianCalendar()
            .getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.of("pt", "BR"))
            .entrySet());
        av.sort(Comparator.comparing(Map.Entry::getValue));

        for(int i=0; i < 6; i++)
            temperaturasMedias.add(new Random().nextDouble(5d, 40d));
        
        double media = temperaturasMedias.stream()
                                        .mapToDouble(Double::doubleValue)
                                        .average()
                                        .orElse(0d);

        System.out.printf("Temperatura média das temperaturas desse semestre: %.1f%n", media);
        
        
        System.out.println("Meses com temp. maior que a média:");
        temperaturasMedias.stream()
                        .filter(temp -> temp > media)
                        .forEach(temp ->System.out.printf(
                            "%s: %.1f%n",
                            av.get(temperaturasMedias.indexOf(temp)).getKey(), temp));
    
        //temperaturasMedias.forEach(temp -> System.out.printf("%.1f ", temp));
    }
}
