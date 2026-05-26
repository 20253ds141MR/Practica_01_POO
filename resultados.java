

public class resultados {
    public static void main(String[] args) {

        double num1 = 0;
        double num2 = 0;

        Suma s = new Suma();
        Resta r = new Resta();
        Multiplicar m = new Multiplicar();
        Division d = new Division();


        double suma = s.suma(num1, num2);
        double resta =  r.restar(num1, num2);
        double multiplicacion = m.multiplicar(num1, num2);
        d.division(num1, num2);
    }

        
    }
