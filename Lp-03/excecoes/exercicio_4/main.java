
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException {

        Scanner cap = new Scanner(System.in);

        String[] nome = new String[15];
        Integer[] tel = new Integer[15];
        Integer[] id = new Integer[15];
        int option = 0, cont = 0, x = 0;

        while (option != 3) {
            System.out.println("Selecione uma opção:"
                    + "\n1 - Consultar Contato"
                    + "\n2 - Adicionar Contato"
                    + "\n3 - Encerrar programa");
            option = cap.nextInt();

            switch (option) {
                case 1:
                    try {

                        System.out.println("Insira o nome do contato que deseja procurar:");
                        String desejo = cap.next();

                        int checkpoint = -1;

                        for (int i = 0; i < nome.length; i++) {
                            if (desejo == nome[1]) {
                                checkpoint = i;
                            }
                        }

                        if (checkpoint == -1) {
                            throw new ContatoNaoExisteException();
                        } else {
                            System.out.println("Identificador: " + id[checkpoint]
                                    + "\nNome: " + nome[checkpoint]
                                    + "\nNúmero: " + tel[checkpoint]);
                        }

                    } catch (ContatoNaoExisteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        if (cont > 15) {
                            throw new AgendaCheiaException();
                        } else {
                            System.out.println("Insira o nome do novo contato:");
                            nome[cont] = cap.next();
                            System.out.println("");
                            while (x != 1) {
                                try {
                                    System.out.println("Insira o número do contato:");
                                    tel[cont] = cap.nextInt();
                                    x = 1;
                                } catch (Exception e) {
                                    System.out.println("Número inválido!");
                                    x = 2;
                                }
                            }
                            id[cont] = cont;
                            cont++;
                        }
                        }catch (AgendaCheiaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Fechando Sistema...");
                    Thread.sleep(800);
                    System.out.println("Apagando dados...");
                    Thread.sleep(800);
                    System.out.println("Sistema encerrado!");
                    }
            }
        }

    }
