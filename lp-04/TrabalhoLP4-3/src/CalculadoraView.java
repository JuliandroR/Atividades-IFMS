
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalculadoraView extends JFrame {
    private CalculadoraController cc;
    private JPanel painel;
    private JTextField num1;
    private JTextField num2;
    private JTextArea jta;
    private JButton btnAdicao, btnSubtracao, btnMultiplicacao, btnDivisao, btnLimpar;
    
    
    public CalculadoraView() {
        cc = new CalculadoraController();
        init();
    }

    public void init() {
        this.setTitle("Calculadora");
        this.setBounds(100, 100, 400, 400);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        painel = new JPanel(null);
        painel.setBounds(0, 0, 400, 400);
        
        num1 = new JFormattedTextField();
        num1.setBounds(10, 10, 180, 35);
        
        num2 = new JFormattedTextField();
        num2.setBounds(200, 10, 180, 35);
        
        btnAdicao = new JButton("+");
        btnAdicao.setBounds(10, 50, 80, 30);
        btnAdicao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValoresInput();
                cc.somar();
                gravaHistorico();
            }
        });
        
        btnSubtracao = new JButton("-");
        btnSubtracao.setBounds(110, 50, 80, 30);
        btnSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValoresInput();
                cc.subtrair();
                gravaHistorico();
            }
        });
        
        btnMultiplicacao = new JButton("*");
        btnMultiplicacao.setBounds(200, 50, 80, 30);
        btnMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValoresInput();
                cc.multiplicar();
                gravaHistorico();
            }
        });
        
        btnDivisao = new JButton("/");
        btnDivisao.setBounds(300, 50, 80, 30);
        btnDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValoresInput();
                cc.dividir();
                gravaHistorico();
            }
        });
        
        jta = new JTextArea();
        jta.setBounds(10, 90, 370, 225);
        jta.setEditable(false);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(10, 330, 370, 30);
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setText("");
                num1.setText("");
                num2.setText("");
            }
        });
        

        painel.add(num1);
        painel.add(num2);
        painel.add(btnAdicao);
        painel.add(btnSubtracao);
        painel.add(btnMultiplicacao);
        painel.add(btnDivisao);
        painel.add(jta);
        painel.add(btnLimpar);
        
        
        
        
        this.getContentPane().add(painel);
    }
    
    public void gravaHistorico(){
        String historico = jta.getText();
        this.jta.setText(cc.getSb() + "\n");
    }
    
    public void getValoresInput(){
        cc.getCalc().setNum1(Double.parseDouble(num1.getText()));
        cc.getCalc().setNum2(Double.parseDouble(num2.getText()));
    }
    
    public static void main(String[] args) {
        CalculadoraView cw = new CalculadoraView();
        cw.setVisible(true);
    }
}
