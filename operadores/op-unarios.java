public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 5;

        // Incremento
        int incremento = ++a;
        System.out.println("Incremento: " + incremento); // ++5 = 6

        // Decremento
        int decremento = --a;
        System.out.println("Decremento: " + decremento); // --6 = 5

        // Negação
        int negacao = -a;
        System.out.println("Negação: " + negacao); // -5 = -5

        // Complemento
        int complemento = ~a;
        System.out.println("Complemento: " + complemento); // ~5 = -6 (inversão de bits)

        // Negação lógica
        boolean b = true;
        boolean negacaoLogica = !b;
        System.out.println("Negação lógica: " + negacaoLogica); // !true = false
    }
}

