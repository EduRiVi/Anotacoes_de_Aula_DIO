import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PerguntasDoCrime {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        List<Integer> respostas = new ArrayList<>();
        
        System.out.println("Telefonou para a vitima?");
        respostas.add(aguardarRespoosta());

        System.out.println("Esteve no local do crime?");
        respostas.add(aguardarRespoosta());
        
        System.out.println("Mora perto da vitima?");
        respostas.add(aguardarRespoosta());
        
        System.out.println("Devia para a vitima?");
        respostas.add(aguardarRespoosta());
        
        System.out.println("Ja trabalhou com a vitima?");
        respostas.add(aguardarRespoosta());

        Iterator<Integer> iterator = respostas.iterator();

        Integer soma = 0;
        while(iterator.hasNext()) soma += iterator.next();
        if (soma == 0) System.out.println("Você é inocente.");
        else if (soma <= 2) System.out.println("Você é suspeto(a).");
        else if (soma <= 4) System.out.println("Você é cúmplice.");
        else System.out.println("Você é assassino(a).");
         
    }

    private static Integer aguardarRespoosta() {
        boolean continuar = true;
        String resposta = "";
        while (continuar) {
            resposta = scanner.next().substring(0,1);
            switch (resposta) {
                case "S", "s", "1":
                    return 1;

                case "N", "n", "0":
                    return 0;
                
                case "q", "Q":
                    continuar = false;
                    System.out.println("Você saiu.");
                    break;
                default:
                    System.out.println("Valor invalido. Digite novamente: ");
                    break;
            }
        }
        System.exit(0);
        return -1;
    }
}
