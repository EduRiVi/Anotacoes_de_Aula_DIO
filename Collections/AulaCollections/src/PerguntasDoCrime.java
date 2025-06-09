import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerguntasDoCrime {
    
    private static Scanner scanner = new Scanner(System.in);
    static Integer soma = 0;
    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vitima?");
         respostas.add(scanner.next().substring(0,1));
         
         System.out.println("Esteve no local do crime?");
         respostas.add(scanner.next().substring(0,1));
         
         System.out.println("Mora perto da vitima?");
         respostas.add(scanner.next().substring(0,1));
         
         System.out.println("Devia para a vitima?");
         respostas.add(scanner.next().substring(0,1));
         
         System.out.println("Ja trabalhou com a vitima?");
         respostas.add(scanner.next().substring(0,1));
         
         respostas.stream().filter(r -> r.equalsIgnoreCase("s")).forEach(temp -> soma++);
        
         if (soma == 0) System.out.println("Você é inocente.");
         else if (soma <= 2) System.out.println("Você é suspeito(a).");
         else if (soma <= 4) System.out.println("Você é cúmplice.");
         else System.out.println("Você é assassino(a).");
         
    }
/* 
private static String aguardarRespoosta(String resposta) {
    boolean continuar = true;
    while (continuar) {
        if(resposta.equalsIgnoreCase("q")) 
        System.exit(0);
        else if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))
        return resposta;
        
        System.out.println("Digite um valor valido (s/n)");
    }
    return "";
}
*/
}
