package trabalholp4.pkg2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginView extends JFrame implements ActionListener{
    private JButton btnLogar;
    private JButton btnSair;
    private JPanel painel;
    private JLabel lbTituloTela;
    private JLabel lbLogin;
    private JLabel lbSenha;
    private JLabel lbResultado;
    private JTextField tfLogin;
    private JPasswordField pfSenha;
    private LoginController lc;
    
    public LoginView() {
        lc = new LoginController();
        init();
    }
    
    public void init(){
        this.setBounds(100, 100, 500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        painel = new JPanel(null);
        painel.setBounds(0, 0, 500, 500);
        
        lbTituloTela = new JLabel();
        lbTituloTela.setBounds(10, 10, 500, 40);
        lbTituloTela.setText("Tela de Autenticação");
        lbTituloTela.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        lbTituloTela.setVerticalTextPosition(SwingConstants.CENTER);
        lbTituloTela.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTituloTela.setHorizontalAlignment(SwingConstants.CENTER);
        painel.add(lbTituloTela);
        
        lbLogin = new JLabel();
        lbLogin.setBounds(
                30, //Define a qual distância estará da lateral esquerda da janela
                110, //Define a qual distância estará do topo da janela
                100, //Define o comprimento do Elemento
                20); //Define a largura do Elemento
        lbLogin.setText("Login: ");
        lbLogin.setFont(new Font("Comic Sans", Font.PLAIN, 15));
        lbLogin.setVerticalTextPosition(SwingConstants.CENTER);
        lbLogin.setHorizontalTextPosition(SwingConstants.CENTER);
        lbLogin.setHorizontalAlignment(SwingConstants.CENTER);
        painel.add(lbLogin);
        
        lbSenha = new JLabel();
        lbSenha.setBounds(
                30, //Define a qual distância estará da lateral esquerda da janela
                200, //Define a qual distância estará do topo da janela
                100, //Define o comprimento do Elemento
                20); //Define a largura do Elemento
        lbSenha.setText("Senha: ");
        lbSenha.setFont(new Font("Comic Sans", Font.PLAIN, 15));
        lbSenha.setVerticalTextPosition(SwingConstants.CENTER);
        lbSenha.setHorizontalTextPosition(SwingConstants.CENTER);
        lbSenha.setHorizontalAlignment(SwingConstants.CENTER);
        painel.add(lbSenha);
        
        tfLogin = new JTextField();
        tfLogin.setBounds(135, 90, 300, 50);
        painel.add(tfLogin);
        
        pfSenha = new JPasswordField();
        pfSenha.setBounds(135, 180, 300, 50);
        painel.add(pfSenha);        
        
        btnLogar = new JButton();
        btnLogar.setBounds(60, 280, 150, 50);
        btnLogar.setText("Autenticar");
        btnLogar.addActionListener(this);
        painel.add(btnLogar);
        
        btnSair = new JButton();
        btnSair.setBounds(290, 280, 150, 50);
        btnSair.setText("Sair");
        btnSair.addActionListener(this);
        painel.add(btnSair);
        
        lbResultado = new JLabel();
        lbResultado.setBounds(0, 370, 500, 50);
        lbResultado.setVerticalTextPosition(SwingConstants.CENTER);
        lbResultado.setHorizontalTextPosition(SwingConstants.CENTER);
        lbResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lbResultado.setFont(new Font("Comic Sans", Font.PLAIN, 16));
        lbResultado.setText("Não Autenticado!");
        painel.add(lbResultado);
        
        this.getContentPane().add(painel);
    }
    
    public void getValoresInput(){
        lc.getUsuario().setLogin(tfLogin.getText());
        lc.getUsuario().setSenha(pfSenha.getText());
    }
    
    public void trocaValorLabelResultado(boolean autenticado){
        if (autenticado) {
            lbResultado.setForeground(Color.GREEN);
            lbResultado.setText("Autenticado");
        }else{
            lbResultado.setForeground(Color.RED);
            lbResultado.setText("Login e/ou Senha Incorreto(s)");
        }
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnLogar){
            getValoresInput();
            trocaValorLabelResultado(lc.efetuarLogin());
        }
        if(e.getSource() == btnSair){
                System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new LoginView().setVisible(true);
    }
    
}
