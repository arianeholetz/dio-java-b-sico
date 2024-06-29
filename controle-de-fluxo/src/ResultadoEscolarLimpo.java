public class ResultadoEscolarLimpo {
    public static void main(String[] args) {
        double nota = 6.5;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Prova de recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
