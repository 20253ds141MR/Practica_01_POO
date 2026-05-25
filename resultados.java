public class resultados {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;

        Suma s = new Suma();
        Resta r = new Resta();
        Multiplicacion m = Multiplicacion();
        Division d = Division();


        double suma = s.sumar(num1,num2);
        double resta r.restar(num1,num2);
        double multiplicacion = m.multiplicacion(num1,num2);
        double division = d.division(num1,num2);

        
    }
