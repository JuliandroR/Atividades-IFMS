/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author labs
 */
public class Janela extends JFrame {
    
    public Janela(String titulo, Dimension tamanho){
        setTitle(titulo);
        setSize(tamanho);
        centralize();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(200, 230, 200));
        
        Image ico;
        ico = Toolkit.getDefaultToolkit().getImage("icone.png");
        setIconImage(ico);
    }
    
    public void centralize(){
        Dimension t = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension j = getSize();
        
        if(j.height > t.height){
            setSize(j.width, t.height);
        }
        
        if(j.width > t.width){
            setSize(j.width, t.height);
        }
        
        setLocation((t.width - j.width) / 2, (t.height - j.height));
    }
    
    public static void main(String[] args){
        Janela janela = new Janela("Janela", new Dimension(300, 200));
        janela.show();
    }
    
}
