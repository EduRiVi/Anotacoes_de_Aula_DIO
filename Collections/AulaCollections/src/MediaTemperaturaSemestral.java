import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;

public class MediaTemperaturaSemestral {
    public static void main(String[] args) {
        
        List<Double> temperaturasMedias = new ArrayList<>();
        Map<String, Integer> mapMeses = new GregorianCalendar().getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.of("pt", "BR"));
        
        String[] arrayMes = new String[12];
        for (Map.Entry<String, Integer> m : mapMeses.entrySet()) 
            arrayMes[m.getValue()] = m.getKey()
                                    .substring(0,1)
                                    .toUpperCase()
                                    .concat(m.getKey().substring(1));


        Random random = new Random();
        for(int i=0; i < 6; i++) 
            temperaturasMedias.add(Math.round(random.nextDouble(5d, 40d)*10)/10d);

        Iterator<Double> iterator = temperaturasMedias.iterator();

        Double soma = 0d;

        //temperaturasMedias.forEach(t -> {soma += t});
        while (iterator.hasNext()) soma += iterator.next();
        
        Double media = Math.round(10 * soma / temperaturasMedias.size())/10d;

        System.out.println("Temperatura média das temperaturas desse semestre: "+ media);
        
        iterator = temperaturasMedias.iterator();
        System.out.println("Meses com temp. maior que a média:");
        while (iterator.hasNext()) {
            Double d = iterator.next();
            if (d > media) 
                System.out.println(arrayMes[temperaturasMedias.indexOf(d)] +": "+ d);

        }
    
        System.out.println(temperaturasMedias);
    }
}
