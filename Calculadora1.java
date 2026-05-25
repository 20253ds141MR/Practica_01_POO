
public class Calculadora1 {
    private double numero1;
    private double numero2;

    public Calculadora1(){

    }

    public Calculadora1(double numero1,double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    public double sumar(){

        return numero1+numero2;
    }

    public double multiplicar(){
        return numero1*numero2;
    }

    public double restar(){

        return numero1-numero2;
    }

    public double division(){
        if(numero2 !=0){
        return numero1/numero2;}
        else{
            throw new ArithmeticException("Division by zero");
        }
    }

    


}
