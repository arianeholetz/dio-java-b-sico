import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Aparelho aparelho = new Aparelho();
        Reprodutor reprodutor = new Reprodutor();
        Navegador navegador = new Navegador();
        Iphone iphone = new Iphone(navegador, aparelho, reprodutor);
                  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao iphone");
        System.out.println("Selecione a opção desejada");
        System.out.println("1- Navegador");
        System.out.println("2- Aparelho");
        System.out.println("3- Reprodutor");

        Integer opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                iphone.navegador();
                break;
        
            case 2:
                iphone.aparelho(); 
                break;
            case 3:
                iphone.reprodutor();
                break;
        }
        System.out.println("Encerrando.");
        scanner.close();
    }       
        
    

}
