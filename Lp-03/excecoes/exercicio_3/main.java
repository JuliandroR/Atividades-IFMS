
import java.util.Scanner;

/*No Projeto Sistema de Banco (Implementação de Contas Corrente e 
Poupança - realizado nas aulas anteriores) foram implementados os 
métodos sacar, depositar e setValorLimite (para conta corrente). 
Nestes três métodos faça com que eles lancem exceptions relacionados 
aos argumentos, por exemplo, sacar, depositar ou setar um valor 
negativo para esses eventos. Lance também uma exception no caso 
de tentar sacar um valor maior que o possível. Nós métodos lancem 
a exception “IllegalArgumentException()” (Java)com comando “throw”, 
passe o motivo da exception(uma String) em seu construtor. Na classe 
main, onde se deve instanciar um objeto da classe "ContaCorrente”, 
use os três métodos construídos acima e trate as exceções propostas 
com os comandos “try” e “catch”, no catch imprimir na tela o método 
“getMessage()” da exception declarada no catch. Cause condições 
apropriadas para a execução das exceções.*/
public class main {

    public static void main(String[] args) {

        Scanner cap = new Scanner(System.in);

        Sistema_Bancario sb = new Sistema_Bancario();

        sb.Saldo = 0;
        sb.limite = 0;

        System.out.println("O que deseja realizar:"
                + "\n1-Saque"
                + "\n2-Deposito"
                + "\n3-Definir Limite");
        int option = cap.nextInt();

        if (option == 1) {
            try {

                System.out.println("Qual o valor?");
                int valor = cap.nextInt();

                if (valor < 0) {
                    throw new IllegalArgumentException();
                } else {
                    if (sb.Saldo == 0 && valor > sb.limite) {
                        throw new IllegalArgumentException();
                    } else {
                        System.out.println("Seu saldo atual é de: " + sb.Sacar(valor));
                    }
                }
            } catch (IllegalArgumentException erro) {
                System.out.println("Valor de saque inválido ou não possível!");
            }
        } else if (option == 2) {

            try {

                System.out.println("Qual o valor?");
                int valor = cap.nextInt();

                if (valor < 0) {
                    throw new IllegalArgumentException();
                } else {
                    System.out.println("Seu saldo atual é de: " + sb.Deposito(valor));
                }
            } catch (IllegalArgumentException erro) {
                System.out.println("Valor de depósito inválido!");
            }

        } else if (option == 3) {
            try {

                System.out.println("Qual o novo limite?");
                int valor = cap.nextInt();

                if (valor < 0) {
                    throw new IllegalArgumentException();
                } else {
                    sb.limite = valor;
                    System.out.println("Seu limite agora é de: " + sb.limite);
                }
            } catch (IllegalArgumentException erro) {
                System.out.println("Valor de inválido!");
            }

        }

    }

}
