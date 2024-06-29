import java.util.Locale;
import java.util.Scanner;

public class TerminalArgumentos {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in) .useLocale(Locale.US));

       System.out.println("Digite seu nome");
       String nome = scanner.next();

       System.out.println("Digite seu sobrenome");
       String sobrenome = scanner.next();

       System.out.println("Digite sua idade");
       int idade = scanner.nextInt();

       System.out.println("Digite seu sobrenome");
       double altura = scanner.nextDouble();

       System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome) ;

    }
    
}
