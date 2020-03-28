package janela;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EventoTeclado extends Janela implements KeyListener{
    JLabel l1;
    JButton b1, b2, b3;
    
    public EventoTeclado(){
        super("Eventos de Teclado", new Dimension(330, 110));
        
        b1 = new JButton("Botão 1");
        b1.setBounds(10, 10, 100, 30);
        b1.addKeyListener(this);
        
        b2 = new JButton("Botão 2");
        b2.setBounds(110, 10, 100, 30);
        b2.addKeyListener(this);
        
        b3 = new JButton("Botão 3");
        b3.setBounds(210, 10, 100, 30);
        b3.addKeyListener(this);
        
        l1 = new JLabel("Pressione \"Enter\" sobre os botões");
        l1.setBounds(5, 50, 208, 20);
        
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(l1);
    }
    
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == 10){
            if(e.getSource() == b1)
                l1.setText("B1 pressionado");
            if(e.getSource() == b2)
                l1.setText("B2 pressionado");
            if(e.getSource() == b3)
                l1.setText("B3 pressionado");
        }
    }

    public void keyTiped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }
    
    public static void main(String[] args) {
        new EventoTeclado().show();
    }
    
    public void keyTyped(KeyEvent arg0){}
    
    
}
