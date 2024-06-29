import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Coleta dos dados do usuário
        System.out.print("Digite seu nome completo: ");
        String nomeSobrenome = scanner.nextLine();
        
        System.out.print("Digite sua agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();
        
        System.out.print("Digite seu saldo: ");
        double saldo = 0.0;
        
        if (scanner.hasNextDouble()) {
            saldo = scanner.nextDouble();
        } else {
            throw new IllegalArgumentException("Formato de saldo inválido. Por favor digite um número válido, com centesimais separados com vírgula. ");
        }

        scanner.nextLine();
        
        // Mensagem formatada
        String mensagem = String.format("Olá %s, obrigada por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.",
                                         nomeSobrenome, agencia, numeroConta, saldo);
        
        // Exibição da mensagem
        System.out.println(mensagem);
        
        scanner.close();
    }
}
