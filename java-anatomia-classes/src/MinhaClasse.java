public class MinhaClasse {

    public static void main(String[] args) {

        final String BR = "Brasil";
        double PI = 3.14;
        int ESTADOS_BRASILEIRO = 27;
        String meuNome = "Ari";
        int anoFabricacao = 1994;
        boolean trueFalse = true;

        String primeiroNome = "Ari";
        String segundoNome = "Holetz";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // Usando as variáveis declaradas
        System.out.println("País: " + BR);
        System.out.println("Valor de PI: " + PI);
        System.out.println("Número de estados brasileiros: " + ESTADOS_BRASILEIRO);
        System.out.println("Meu nome: " + meuNome);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Valor booleano: " + trueFalse);
        System.out.println("Nome completo: " + nomeCompleto);
        
        System.out.println("UM GRANDE SOCORRO");
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return " Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
