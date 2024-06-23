public class SmartTv {
    private int volume;
    private int canal;
    private boolean ligada;

    public SmartTv() {
        this.volume = 10; // Volume inicial
        this.canal = 1;   // Canal inicial
        this.ligada = false; // TV inicialmente desligada
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void aumentarVolume() {
        if (volume < 100) { // Supondo que 100 seja o volume máximo
            volume++;
        }
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal > 0 && novoCanal <= 999) { // Supondo que os canais variem de 1 a 999
            canal = novoCanal;
        }
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // Getters
    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public boolean isLigada() {
        return ligada;
    }
}
