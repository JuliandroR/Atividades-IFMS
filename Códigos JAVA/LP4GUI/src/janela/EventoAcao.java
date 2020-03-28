package janela;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EventoAcao extends Janela implements ActionListener{
    
    JLabel l1;
    JButton b1, b2;
    int i1, i2;
    
    public EventoAcao() {
        super("Eventos de Ação", new Dimension(240, 100));
        i1 = i2 = 0;
        
        b1 = new JButton("Gravar");
        b1.setBounds(10, 10, 100, 30);
        b1.addActionListener((ActionListener) this);
        
        b2 = new JButton("Sair");
        b2.setBounds(120, 10, 100, 30);
        b2.addActionListener(this);
        
        l1 = new JLabel("Pressione os Botões");
        l1.setBounds(5, 50, 220, 20);
        
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(l1);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            l1.setText("Gravar Pressionado " + ++i1 + " vez(es)");
        }
        
        if(e.getSource() == b2){
            l1.setText("Sair Pressionado " + ++i2 + " vez(es)");
        }
    }
    
    public static void main(String[] args) {
        new EventoAcao().show();
    }
    
}
