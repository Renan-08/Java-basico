public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Igual a
        boolean igual = (a == b);
        System.out.println("Igual a: " + igual); // 10 == 5 -> false

        // Diferente de
        boolean diferente = (a != b);
        System.out.println("Diferente de: " + diferente); // 10 != 5 -> true

        // Maior que
        boolean maior = (a > b);
        System.out.println("Maior que: " + maior); // 10 > 5 -> true

        // Menor que
        boolean menor = (a < b);
        System.out.println("Menor que: " + menor); // 10 < 5 -> false

        // Maior ou igual a
        boolean maiorOuIgual = (a >= b);
        System.out.println("Maior ou igual a: " + maiorOuIgual); // 10 >= 5 -> true

        // Menor ou igual a
        boolean menorOuIgual = (a <= b);
        System.out.println("Menor ou igual a: " + menorOuIgual); // 10 <= 5 -> false
    }
}

