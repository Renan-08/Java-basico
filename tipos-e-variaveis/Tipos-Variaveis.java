public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos
        
        // Inteiros
        byte variavelByte = 100; // Pode armazenar valores de -128 a 127
        short variavelShort = 10000; // Pode armazenar valores de -32768 a 32767
        int variavelInt = 100000; // Pode armazenar valores de -2^31 a 2^31-1
        long variavelLong = 100000L; // Pode armazenar valores de -2^63 a 2^63-1
        
        // Ponto flutuante
        float variavelFloat = 3.14f; // Precisa do 'f' no final, pode armazenar valores decimais com precisão de 6-7 dígitos
        double variavelDouble = 3.141592653589793; // Maior precisão que float, cerca de 15 dígitos
        
        // Caracter
        char variavelChar = 'A'; // Armazena um único caractere unicode
        
        // Booleano
        boolean variavelBoolean = true; // Pode ser true ou false

        // Tipos não primitivos (ou referência)
        
        // String
        String variavelString = "Olá, mundo!"; // Cadeia de caracteres

        // Impressão dos valores das variáveis
        System.out.println("Variável byte: " + variavelByte);
        System.out.println("Variável short: " + variavelShort);
        System.out.println("Variável int: " + variavelInt);
        System.out.println("Variável long: " + variavelLong);
        System.out.println("Variável float: " + variavelFloat);
        System.out.println("Variável double: " + variavelDouble);
        System.out.println("Variável char: " + variavelChar);
        System.out.println("Variável boolean: " + variavelBoolean);
        System.out.println("Variável string: " + variavelString);
    }
}

