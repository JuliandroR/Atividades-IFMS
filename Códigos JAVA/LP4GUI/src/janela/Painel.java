package janela;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Painel extends Janela{
    JButton b1, b2;
    JPanel p1, p2;
    
    public Painel() {
        super("Painel", new Dimension(200, 200));
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(10, 10, 170, 70);
        p1.setBackground(Color.GREEN);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(10, 90, 170, 70);
        p2.setBackground(Color.YELLOW);
        
        b1 = new JButton("Gravar");
        b1.setBounds(35, 30, 100, 30);
        b2 = new JButton("Sair");
        b2.setBounds(35, 30, 100, 30);
        
        p1.add(b1);
        p2.add(b2);
        
        getContentPane().add(p1);
        getContentPane().add(p2);
    }
    
    public static void main(String[] args) {
        new Painel().show();
    }
}
