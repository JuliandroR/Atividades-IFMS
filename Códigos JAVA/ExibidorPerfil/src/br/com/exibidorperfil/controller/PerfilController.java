package br.com.exibidorperfil.controller;

import br.com.exibidorperfil.model.Perfil;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class PerfilController {
    private Perfil perfil;
    
    public void carregaPerfil(String path) throws FileNotFoundException{
        File f = new File(path);
        Scanner sc = new Scanner(f);
        sc.useLocale(Locale.ENGLISH);
        perfil = new Perfil();
        
        perfil.setNome(sc.nextLine());
        perfil.setSexo(sc.nextLine());
        perfil.setFoto(sc.nextLine());
        perfil.setIdade(sc.nextInt());
        perfil.setAltura(sc.nextFloat());
        perfil.setPeso(sc.nextFloat());
        
        
        sc.close();
    }

    public Perfil getPerfil() {
        return perfil;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        PerfilController pc = new PerfilController();
        pc.carregaPerfil("Chibs.txt");
        System.out.println(pc.getPerfil().getNome());
    }
}
