package janela;

import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EventoFoco extends Janela implements FocusListener{

    JLabel l1, l2;
    JButton b1, b2, b3;
    
    public EventoFoco(){
        super("Evento de Foco", new Dimension(330, 120));
        
        b1 = new JButton("Botão 1");
        b1.setBounds(10, 10, 100, 30);
        b1.addFocusListener(this);
        
        b2 = new JButton("Botão 2");
        b2.setBounds(110, 10, 100, 30);
        b2.addFocusListener(this);
        
        b3 = new JButton("Botão 3");
        b3.setBounds(210, 10, 100, 30);
        
        l1 = new JLabel();
        l1.setBounds(5, 50, 208, 20);
        
        l2 = new JLabel();
        l2.setBounds(5, 70, 208, 20);
        
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(l1);
        getContentPane().add(l2);
        
        
       
    }

    public void focusGained(FocusEvent e) {
        if(e.getSource() == b1) l1.setText("B1 recebeu o foco");
        if(e.getSource() == b2) l1.setText("B2 recebeu o foco");
        if(e.getSource() == b3) l1.setText("B3 recebeu o foco");
    }

    public void focusLost(FocusEvent e) {
        if(e.getSource() == b1) l2.setText("B1 perdeu o foco");
        if(e.getSource() == b2) l2.setText("B2 perdeu o foco");
        if(e.getSource() == b3) l2.setText("B3 perdeu o foco");
    }
    
    public static void main(String[] args) {
        new EventoFoco().show();
    }
}
