public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        // Diminui o volume três vezes
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        
        // Aumenta o volume uma vez
        smartTv.aumentarVolume();

        // Imprime o canal atual
        System.out.println("Canal atual: " + smartTv.getCanal());

        // Muda para o canal 13
        smartTv.mudarCanal(13);

        // Imprime o canal atual após a mudança
        System.out.println("Canal atual: " + smartTv.getCanal());

        // Imprime o volume atual
        System.out.println("Volume atual: " + smartTv.getVolume());

        // Imprime o status da TV (ligada ou não) e o canal e volume atuais
        System.out.println("TV ligada? " + smartTv.isLigada());
        System.out.println("Canal atual: " + smartTv.getCanal());
        System.out.println("Volume atual: " + smartTv.getVolume());

        // Liga a TV e imprime o novo status
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.isLigada());
    }
}