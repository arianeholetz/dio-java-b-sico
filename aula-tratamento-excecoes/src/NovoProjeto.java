import java.util.Scanner;
import java.util.InputMismatchException;

public class NovoProjeto {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Minha idade é " + idade + " anos.");
            System.out.println("Minha altura é " + altura + " metros.");
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
