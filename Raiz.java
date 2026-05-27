
public class Raiz {

    public double sacarRaiz(double radicando, double resultado) {
        if (radicando > 0) {
            resultado = Math.sqrt(radicando);
        } else {
            System.out.println("Error: No se puede sacar una raiz cuadrada de un numero negativo");
        }
        return resultado;
    }
}
