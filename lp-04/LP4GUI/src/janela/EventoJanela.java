package janela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoJanela extends Janela implements WindowListener {

    public EventoJanela() {
        super("Eventos de Janela", new Dimension(300, 200));
        getContentPane().setBackground(Color.GREEN);
        addWindowListener(this);
        
        addWindowListener(new WindowListener() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            public void windowOpened(WindowEvent e) {
            }

            public void windowClosed(WindowEvent e) {
            }

            public void windowIconified(WindowEvent e) {
            }

            public void windowDeiconified(WindowEvent e) {
            }

            public void windowActivited(WindowEvent e) {
            }

            public void windowDesactivated(WindowEvent e) {
            }
            
            public void windowActivated(WindowEvent e) {
            }
            
            public void windowDeactivated(WindowEvent e) {
            }
        });
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        addWindowListener(new Ouvinte1());
        addWindowListener(new Ouvinte2());
        
    }
    
    public void windowOpened(WindowEvent e) {
    }
    
    public void windowClosing(WindowEvent e) {System.exit(0);}
    
    public void windowClosed(WindowEvent e) {}
    
    public void windowIconified(WindowEvent e) {}
    
    public void windowDeiconified(WindowEvent e) {}
    
    public void windowActivated(WindowEvent e) {}
    
    public void windowDeactivated(WindowEvent e) {}
    
    public static void main(String[] args){
        new EventoJanela().show();
    }
    
    class Ouvinte1 implements WindowListener{

        public void windowOpened(WindowEvent e) {}

        public void windowClosing(WindowEvent e) {System.exit(0);}

        public void windowClosed(WindowEvent e) {}

        public void windowIconified(WindowEvent e) {}

        public void windowDeiconified(WindowEvent e) {}

        public void windowActivated(WindowEvent e) {}

        public void windowDeactivated(WindowEvent e) {}
        
    }
    
    class Ouvinte2 extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
}
