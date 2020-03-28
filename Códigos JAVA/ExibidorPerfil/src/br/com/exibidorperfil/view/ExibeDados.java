package br.com.exibidorperfil.view;

import br.com.exibidorperfil.controller.PerfilController;
import br.com.exibidorperfil.model.Perfil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ExibeDados extends JFrame{
    
    PerfilController pc = new PerfilController();
    JLabel image, nome, sexo, idade, altura, peso;
    
    public ExibeDados() throws FileNotFoundException {
        
        setSize(new Dimension(1200, 400));
        setLocation(100, 100);
        setUndecorated(true);
        setBackground(new Color(178, 180, 178));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        pc.carregaPerfil(JOptionPane.showInputDialog(null, "Insira o nome do arquivo", "Insira", JOptionPane.QUESTION_MESSAGE) + ".txt");
        Perfil perfil = pc.getPerfil();
        
        image = new JLabel();
        image.setBounds(20, 0, 500, 400);
        image.setIcon(new ImageIcon(perfil.getFoto()));
        getContentPane().add(image);
        
        nome = new JLabel();
        nome.setBounds(600, 80, 500, 40);
        nome.setFont(new Font("Comic Sans", Font.BOLD, 30));
        nome.setVerticalTextPosition(SwingConstants.CENTER);
        nome.setHorizontalTextPosition(SwingConstants.CENTER);
        nome.setHorizontalAlignment(SwingConstants.CENTER);
        nome.setText(perfil.getNome());
        getContentPane().add(nome);
        
        sexo = new JLabel();
        sexo.setBounds(600, 140, 500, 40);
        sexo.setFont(new Font("Comic Sans", Font.BOLD, 30));
        sexo.setVerticalTextPosition(SwingConstants.CENTER);
        sexo.setHorizontalTextPosition(SwingConstants.CENTER);
        sexo.setHorizontalAlignment(SwingConstants.CENTER);
        sexo.setText(perfil.getSexo());
        getContentPane().add(sexo);
        
        idade = new JLabel();
        idade.setBounds(600, 200, 500, 40);
        idade.setFont(new Font("Comic Sans", Font.BOLD, 30));
        idade.setVerticalTextPosition(SwingConstants.CENTER);
        idade.setHorizontalTextPosition(SwingConstants.CENTER);
        idade.setHorizontalAlignment(SwingConstants.CENTER);
        idade.setText("" + perfil.getIdade());
        getContentPane().add(idade);       
        
        altura = new JLabel();
        altura.setBounds(600, 260, 500, 40);
        altura.setFont(new Font("Comic Sans", Font.BOLD, 30));
        altura.setVerticalTextPosition(SwingConstants.CENTER);
        altura.setHorizontalTextPosition(SwingConstants.CENTER);
        altura.setHorizontalAlignment(SwingConstants.CENTER);
        altura.setText("" + perfil.getAltura());
        getContentPane().add(altura);  
        
        peso = new JLabel();
        peso.setBounds(600, 320, 500, 40);
        peso.setFont(new Font("Comic Sans", Font.BOLD, 30));
        peso.setVerticalTextPosition(SwingConstants.CENTER);
        peso.setHorizontalTextPosition(SwingConstants.CENTER);
        peso.setHorizontalAlignment(SwingConstants.CENTER);
        peso.setText("" + perfil.getPeso());
        getContentPane().add(peso); 
    }
    
       
    public static void main(String[] args) throws FileNotFoundException {
        ExibeDados j = new ExibeDados();
        j.show();
    }
}
