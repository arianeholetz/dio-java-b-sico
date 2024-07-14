import java.util.Scanner;

public class Iphone {
    private NavegadorNaInternet navegadorNaInternet;
    private AparelhoTelefonico aparelhoTelefonico;
    private ReprodutorMusical reprodutorMusical;

    public Iphone(NavegadorNaInternet navegadorNaInternet, AparelhoTelefonico aparelhoTelefonico,
            ReprodutorMusical reprodutorMusical) {
        this.navegadorNaInternet = navegadorNaInternet;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.reprodutorMusical = reprodutorMusical;
    }

    public NavegadorNaInternet getNavegadorNaInternet() {
        return navegadorNaInternet;
    }

    public void setNavegadorNaInternet(NavegadorNaInternet navegadorNaInternet) {
        this.navegadorNaInternet = navegadorNaInternet;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    void reprodutor(){
        System.out.println("Escolha a opção desejada: ");
        System.out.println("1- Tocar");
        System.out.println("2- Pausar");
        System.out.println("3- Selecionar música: ");
        Scanner scanner = new Scanner(System.in);
        Integer opcao = scanner.nextInt();
        while (opcao < 0 || opcao > 3) {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1- Tocar");
            System.out.println("2- Pausar");
            System.out.println("3- Selecionar música ");
            opcao = scanner.nextInt();
        }
        switch (opcao) {
            case 1:
                this.reprodutorMusical.tocar();
                break;
            case 2: 
                this.reprodutorMusical.pausar();
                break;
            case 3:
                this.reprodutorMusical.selecionarMusica();
                break;
        }
        scanner.close();
    }

    void aparelho(){
        System.out.println("Escolha a opção desejada: ");
        System.out.println("1- Ligar");
        System.out.println("2- Atender");
        System.out.println("3- Correio de voz");
        Scanner scanner = new Scanner(System.in);
        Integer opcao = scanner.nextInt();
        while (opcao < 0 || opcao > 3) {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1- Ligar");
            System.out.println("2- Atender");
            System.out.println("3- Correio de voz");
            opcao = scanner.nextInt();
        }
        switch (opcao) {
            case 1:
                this.aparelhoTelefonico.ligar();
                break;
            case 2: 
                this.aparelhoTelefonico.atender();
                break;
            case 3:
                this.aparelhoTelefonico.iniciarCorreioVoz();
                break;
        }
        
        scanner.close();
    }

    void navegador (){
        System.out.println("Escolha a opção desejada: ");
        System.out.println("1- Exibir página ");
        System.out.println("2- Atualizar página ");
        System.out.println("3- Adicionar nova aba ");

        Scanner scanner = new Scanner (System.in);
        Integer opcao = scanner.nextInt();
        while (opcao < 1 || opcao > 3){
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1- Exibir página ");
            System.out.println("2- Atualizar página ");
            System.out.println("3- Adicionar nova aba ");
            opcao = scanner.nextInt();
        } 
        switch (opcao) {
            case 1:
                this.navegadorNaInternet.exibirPagina();
                break;

            case 2:
                this.navegadorNaInternet.atualizarPagina();
                break;

            case 3:
                this.navegadorNaInternet.adicionarNovaAba();
                break;
        }

        scanner.close();
    }
    
    
}
