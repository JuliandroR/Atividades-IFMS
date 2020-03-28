/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela;

import javax.swing.JFrame;

/**
 *
 * @author labs
 */
public class ExemploJanela {
    public static void main(String[] args){
        JFrame janela = new JFrame("Exemplo de janela"); //criada invisivel
        janela.setVisible(true); //mostra a janela
        janela.setBounds(100, 100, 300, 400); //tamanho da janela
        janela.setResizable(false); //n deixar aumentar a janela
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //mata a janela quando clica no X
    }
}
