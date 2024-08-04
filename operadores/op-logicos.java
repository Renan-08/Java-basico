public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // E lógico
        boolean eLogico = (a && b);
        System.out.println("E lógico: " + eLogico); // true && false -> false

        // OU lógico
        boolean ouLogico = (a || b);
        System.out.println("OU lógico: " + ouLogico); // true || false -> true

        // Negação lógica
        boolean negacaoLogica = !a;
        System.out.println("Negação lógica: " + negacaoLogica); // !true -> false
    }
}

