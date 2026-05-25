public class Division {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 2;

        if (denominador != 0) {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Error: división entre cero no permitida.");
        }
    }
}
