
package janela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Botao extends Janela{
    
    JButton b1, b2;
    
    public Botao(){
        super("Botões", new Dimension(300, 100));
        
        b1 = new JButton();
        b1.setText("Gravar");
        b1.setBounds(50, 30, 100, 30);
        b1.setBackground(new Color(0, 0, 170));
        b1.setForeground(Color.YELLOW);
        b1.setFont(new Font("Helvetica", Font.BOLD, 12));
        b1.setToolTipText(("Botão B1"));
        b1.setIcon(new ImageIcon("Salvar.gif"));
        b1.setHorizontalAlignment(SwingConstants.CENTER);
        b1.setVerticalAlignment(SwingConstants.CENTER);
        b1.setHorizontalTextPosition(SwingConstants.RIGHT);
        b1.setVerticalTextPosition(SwingConstants.CENTER);
        b1.setEnabled(false);
        b1.setMnemonic('G');
        
        b2 = new JButton("Sair");
        b2.setBounds(150, 30, 100, 30);
        b2.setBackground(new Color(0, 0, 170));
        b2.setForeground(Color.YELLOW);
        b2.setFont(new Font("Helvetica", Font.BOLD, 12));
        b2.setToolTipText("Botão B2");
        b2.setIcon(new ImageIcon("Sair.png"));
        b2.setHorizontalAlignment(SwingConstants.CENTER);
        b2.setVerticalAlignment(SwingConstants.CENTER);
        b2.setHorizontalTextPosition(SwingConstants.RIGHT);
        b2.setVerticalTextPosition(SwingConstants.CENTER);
        b2.setEnabled(true);
        b2.setMnemonic('S');
        
        getContentPane().add(b1);
        getContentPane().add(b2);
        
    }
    
    public static void main(String[] args) {
        new Botao().show();
    }
    
}
