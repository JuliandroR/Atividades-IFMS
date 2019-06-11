package janela;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EventoComponente extends Janela implements ComponentListener{
    JLabel l1;
    JButton b1, b2, b3, b4;
    int i1, i2, i3, i4;
    
    public EventoComponente(){
        super("Evento de Componente", new Dimension(400, 150));
        i1 = i2 = i3 = i4 = 0;
        
        b1 = new JButton("Ocultar");
        b1.setBounds(10, 10, 100, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(b1.getText().equals("Ocultar")){
                    b1.setText("Exibir");
                    b4.setVisible(false);
                    return;
                }
                if(b1.getText().equals("Exibir")){
                    b1.setText("Ocultar");
                    b4.setVisible(true);
                }
                
            }
        });
        
        b2 = new JButton("Mover");
        b2.setBounds(110, 10, 100, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((b4.getX() + b4.getWidth()) < 380){
                    b4.setLocation(b4.getX() + 10, 60);
                }else{
                    b4.setLocation(10, 60);
                }
            }
        });
        
        b3 = new JButton("Redimensionar");
        b3.setBounds(210, 10, 170, 30);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(b4.getWidth() < 200)
                    b4.setSize(b4.getWidth() + 10, 30);
                else
                    b4.setSize(100, 30);
                if ((b4.getX() + b4.getWidth()) > 380)
                    b4.setLocation(10, 60);
            }
        });
        
        b4 = new JButton();
        b4.setBounds(10, 60, 100, 30);
        b4.addComponentListener(this);
        
        l1 = new JLabel("Pressione os Botões");
        l1.setBounds(5, 100, 380, 20);
        
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(l1);
    }
    
    public void componentHidden(ComponentEvent e){
        l1.setText("Botão Ocultado " + ++i1 + " vez(es)");
    }
    
    public void componentShown(ComponentEvent e){
        l1.setText("Botão Exibido " + ++i2 + " vez(es)");
    }
    public void componentMoved(ComponentEvent e){
        l1.setText("Botão Movido " + ++i3 + " vez(es)");
    }
    public void componentResized(ComponentEvent e){
        l1.setText("Botão Redimensionado " + ++i4 + " vez(es)");
    }
    
    public static void main(String[] args) {
        new EventoComponente().show();
    }
}
