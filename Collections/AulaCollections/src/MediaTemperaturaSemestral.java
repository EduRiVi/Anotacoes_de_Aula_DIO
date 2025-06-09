import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;

public class MediaTemperaturaSemestral {
    public static void main(String[] args) {
        
        List<Double> temperaturasMedias = new ArrayList<>();
        Map<String, Integer> mapMeses = new GregorianCalendar().getDisplayNames(
                                                Calendar.MONTH, 
                                                Calendar.LONG, 
                                                Locale.of("pt", "BR"));
        
        
        String[] arrayMes = new String[12];
        mapMeses.keySet().forEach(mes -> arrayMes[mapMeses.get(mes)] = mes);
        
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
                        .forEach(temp -> System.out.printf("%s: %.1f%n",
                            arrayMes[temperaturasMedias.indexOf(temp)], temp));
    
        temperaturasMedias.forEach(temp -> System.out.printf("%.1f ", temp));
    }
}
