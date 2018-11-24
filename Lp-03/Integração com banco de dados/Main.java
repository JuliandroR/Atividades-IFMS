
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner cap = new Scanner(System.in);
        Usuario user = new Usuario();
        UsuarioDAO userDao = new UsuarioDAO();
        int input = 0;
        int cont = 0;

        while (input != 5) {
            System.out.println("_____________________________________________________________________"
                    + "¨\nInsira o opção desejada:"
                    + "\n1 - Cadastrar Usuário"
                    + "\n2 - Alterar Usuário"
                    + "\n3 - Consultar Usuário"
                    + "\n4 - Excluir Usuário"
                    + "\n5 - Encerrar Programa"
                    + "\n_____________________________________________________________________");
            input = cap.nextInt();

            switch (input) {
                case 1:
                    user.setId(cont);
                    cont++;
                    System.out.println("Digite o nome:");
                    user.setNome(cap.next());

                    System.out.println("Digite o sobrenome:");
                    user.setSobrenome(cap.next());

                    System.out.println("Digite o email:");
                    user.setEmail(cap.next());

                    System.out.println("Digite o telefone:");
                    user.setTelefone(cap.next());

                    System.out.println("Digite o tipo:");
                    user.setTipo(cap.next());

                    System.out.println("Digite o Usuário:");
                    user.setUsuario(cap.next());

                    System.out.println("Digite a Senha:");
                    user.setSenha(cap.next());

                    userDao.inserir(user);

                    Thread.sleep(800);
                    System.out.println("Usuário Cadastrado");
                    break;

                case 2:
                    System.out.println("Insira o ID do usuário:");
                    int id = cap.nextInt();
                    
                    user = userDao.selecionarId(id);

                    System.out.println("_____________________________________________________________________");
                    System.out.println("Id: " + user.getId());
                    System.out.println("Nome: " + user.getNome());
                    System.out.println("Sobrenome: " + user.getSobrenome());
                    System.out.println("Email: " + user.getEmail());
                    System.out.println("Telefone: " + user.getTelefone());
                    System.out.println("Tipo: " + user.getTipo());
                    System.out.println("Usuário: " + user.getUsuario());
                    System.out.println("Senha: " + user.getSenha());
                    System.out.println("_____________________________________________________________________");
                    
                     System.out.println("Digite o nome:");
                    user.setNome(cap.next());

                    System.out.println("Digite o sobrenome:");
                    user.setSobrenome(cap.next());

                    System.out.println("Digite o email:");
                    user.setEmail(cap.next());

                    System.out.println("Digite o telefone:");
                    user.setTelefone(cap.next());

                    System.out.println("Digite o tipo:");
                    user.setTipo(cap.next());

                    System.out.println("Digite o Usuário:");
                    user.setUsuario(cap.next());

                    System.out.println("Digite a Senha:");
                    user.setSenha(cap.next());

                    userDao.alterar(id, user);

                    Thread.sleep(800);
                    System.out.println("Usuário Alterado");
                    

                    break;

                case 3:
                    System.out.println("Insira o ID do usuário que deseja consultar:");
                    int idC = cap.nextInt();

                    user = userDao.selecionarId(idC);
                    
                    Thread.sleep(800);

                    System.out.println("_____________________________________________________________________");
                    System.out.println("Id: " + user.getId());
                    System.out.println("Nome: " + user.getNome());
                    System.out.println("Sobrenome: " + user.getSobrenome());
                    System.out.println("Email: " + user.getEmail());
                    System.out.println("Telefone: " + user.getTelefone());
                    System.out.println("Tipo: " + user.getTipo());
                    System.out.println("Usuário: " + user.getUsuario());
                    System.out.println("Senha: " + user.getSenha());
                    System.out.println("_____________________________________________________________________");

                    break;
                    
                case 4:
                    System.out.println("Insira o ID do usuário que deseja excluir:");
                    int idE = cap.nextInt();

                    user = userDao.selecionarId(idE);
                    Thread.sleep(800);

                    System.out.println("_____________________________________________________________________");
                    System.out.println("Id: " + user.getId());
                    System.out.println("Nome: " + user.getNome());
                    System.out.println("Sobrenome: " + user.getSobrenome());
                    System.out.println("Email: " + user.getEmail());
                    System.out.println("Telefone: " + user.getTelefone());
                    System.out.println("Tipo: " + user.getTipo());
                    System.out.println("Usuário: " + user.getUsuario());
                    System.out.println("Senha: " + user.getSenha());
                    System.out.println("_____________________________________________________________________");
                    
                    System.out.println("Deseja realmente excluir?"
                            + "\n1 - Para Sim"
                            + "\n2 - Para Não");
                    int decision = cap.nextInt();
                    
                    if(decision == 1){
                        userDao.excluir(idE);
                        Thread.sleep(800);
                    System.out.println("Usuário Excluído");
                    }else{
                        System.out.println("Certo, opção cancelada");
                    }
                    
            }
        }
    }

}
