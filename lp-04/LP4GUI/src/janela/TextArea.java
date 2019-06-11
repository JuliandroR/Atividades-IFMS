package janela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextArea extends Janela implements ActionListener {

    JTextArea jt;
    JButton b1, b2;
    JLabel l;

    public TextArea() {
        super("Text Area", new Dimension(700, 600));

        jt = new JTextArea("Area de Texto");
        jt.setBounds(
                50, //Define a qual distância estará da lateral esquerda da janela
                50, //Define a qual distância estará do topo da janela
                500, //Define o comprimento do Elemento
                100); //Define a largura do Elemento

        getContentPane().add(jt);

        b1 = new JButton("Botão 1");
        b1.setBounds(10, 300, 100, 40);
        b1.setText("Mostrar");
        b1.addActionListener(this);

        b2 = new JButton("Botão 2");
        b2.setBounds(10, 400, 100, 40);
        b2.setText("Limpar");
        b2.addActionListener(this);

        l = new JLabel("Aqui fica o texto ao clicar em \"Mostrar\" ");
        l.setForeground(Color.WHITE);
        l.setBounds(10, 450, 290, 200);

        getContentPane().add(jt);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(l);
    }

    public static void main(String[] args) {
        new TextArea().show();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            l.setText(jt.getText());
        }
        
        if(ae.getSource() == b2){
            jt.setText("");
            l.setText("Aqui fica o texto ao clicar em \"Mostrar\" ");
       }
    }

}
