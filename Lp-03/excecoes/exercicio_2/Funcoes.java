
import java.util.Scanner;

public class Funcoes {

    public void calculaFGTS() throws Exception {
        Scanner cap = new Scanner(System.in);
        int cont = 0;
        Double salario = 0.0;
        String nome = null;

        while (cont != 1) {
            try {
                System.out.println("Insira o nome:");
                nome = cap.nextLine();

                if (nome.length() > 4 && nome.length() < 11) {
                    cont = 1;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Nome incorreto, digite novamente:");
                cont = 2;
            }
        }
        cont = 0;

        while (cont != 1) {
            try {
                System.out.println("Insira o valor de seu salário, use ',' para colocar o centavos");
                salario = cap.nextDouble();
                
                if(salario < 900.0){
                    throw new Exception();
            }else{
                    cont = 1;
                }

            }
            catch(Exception e){
                System.out.println("Valor Digitado, insira novamente:");
                cont = 2;
            }

        }
        
        System.out.println("Processando...");
        Thread.sleep(1000);
        
        System.out.println("Nome: " + nome
        + "\nSalário: " + salario
        + "\nValor do FGTS: " + salario*0.08);

    }
}
