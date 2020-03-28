
public class CalculadoraController {
    private Calculadora calc;
    private StringBuilder sb;

    public CalculadoraController() {
        calc = new Calculadora();
        sb = new StringBuilder();
    }

    public Calculadora getCalc() {
        return calc;
    }

    public StringBuilder getSb() {
        return sb;
    }
    
    public void somar(){
        sb.append(calc.getNum1() + " + " + calc.getNum2() + " = " + calc.adicao() + "\n");
    }
    
    public void subtrair(){
        sb.append(calc.getNum1() + " - " + calc.getNum2() + " = " + calc.subtracao()+ "\n");
    }
    
    public void multiplicar(){
        sb.append(calc.getNum1() + " * " + calc.getNum2() + " = " + calc.multiplicacao()+ "\n");
    }
    
    public void dividir(){
        sb.append(calc.getNum1() + " / " + calc.getNum2() + " = " + calc.divisao()+ "\n");
    }
}
