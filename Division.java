public class Division {
    public static void division(double numerador,double denominador) {
        if (denominador != 0) {
            double resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Error: división entre cero no permitida.");
        }
    }
}
