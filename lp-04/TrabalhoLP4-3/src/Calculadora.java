
public class Calculadora {
    private double num1, num2, resultado;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double adicao(){
        return num1+num2;
    }
    public double subtracao(){
        return num1-num2;
    }
    public double multiplicacao(){
        return num1*num2;
    }
    
    public double divisao(){
        return num1/num2;
    }
    
}
