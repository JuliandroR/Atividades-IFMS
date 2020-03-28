package janela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Rotulo extends Janela{
    
    JLabel label1, label2, label3;

    public Rotulo() {
        super("Rótulo", new Dimension(400, 200));
        ImageIcon ico = new ImageIcon("icone.png");
        
        label1 = new JLabel();
        label1.setText("Rótulo 1");
        label1.setLocation(10, 10);
        label1.setSize(370, 50);
        label1.setOpaque(true);
        label1.setBackground(Color.GREEN);
        label1.setForeground(Color.BLUE);
        label1.setFont(new Font("Courrier", Font.BOLD, 21));
        label1.setToolTipText("Rótulo Verde");
        label1.setIcon(ico);
        label1.setHorizontalAlignment(SwingConstants.LEFT);
        label1.setVerticalAlignment(SwingConstants.TOP);
        label1.setHorizontalTextPosition(SwingConstants.RIGHT);
        label1.setVerticalTextPosition(SwingConstants.CENTER);
        
        label2 = new JLabel("Rótulo 2");
        label2.setBounds(10, 60, 370, 50);
        label2.setOpaque(true);
        label2.setBackground(Color.YELLOW);
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Courrier", Font.BOLD, 21));
        label2.setToolTipText("Rótulo Amarelo");
        label2.setIcon(ico);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label2.setHorizontalTextPosition(SwingConstants.CENTER);
        label2.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        label3 = new JLabel("Rótulo 3", ico, SwingConstants.RIGHT);
        label3.setBounds(10, 110, 370, 50);
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setForeground(Color.RED);
        label2.setFont(new Font("Courrier", Font.BOLD, 21));
        label3.setVerticalAlignment(SwingConstants.BOTTOM);
        label3.setHorizontalTextPosition(SwingConstants.LEFT);
        label3.setVerticalTextPosition(SwingConstants.CENTER);
        
        getContentPane().add(label1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        
    }
    
    public static void main(String[] args) {
        new Rotulo().show();
    }
    
}
