package janela;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EventoMouse extends Janela implements MouseListener {
    JLabel l1;
    JButton b1, b2, b3;
    
    
    public EventoMouse() {
        super("Eventos de Mouse", new Dimension(330, 100));
        
        b1 = new JButton("B1");
        b1.setBounds(10, 10, 100, 30);
        b1.addMouseListener(this);
        
        b2 = new JButton("B2");
        b2.setBounds(110, 10, 100, 30);
        b2.addMouseListener(this);
        
        b3 = new JButton("B3");
        b3.setBounds(210, 10, 100, 30);
        b3.addMouseListener(this);
        
        l1 = new JLabel("Passe o mouse e clique sobre os botões");
        l1.setBounds(5, 50, 280, 20);
        
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(l1);
    }

    public void mousePressed(MouseEvent me) {
    }
    
    public void mouseReleased(MouseEvent me) {
    }
    
    public void mouseExited(MouseEvent me) {
    }
    
    public void mouseEntered(MouseEvent me) {
        if(me.getSource() == b1)
            b1.requestFocus();
        if(me.getSource() == b2)
            b2.requestFocus();
        if(me.getSource() == b3)
            b3.requestFocus();
    }
    
    public void mouseClicked(MouseEvent me) {
        if(me.getSource() == b1)
            l1.setText("Botão 1 clicado");
        if(me.getSource() == b2)
            l1.setText("Botão 2 clicado");
        if(me.getSource() == b3)
            l1.setText("Botão 3 clicado");
    }
    
    public static void main(String[] args) {
        new EventoMouse().show();
    }
    
}
