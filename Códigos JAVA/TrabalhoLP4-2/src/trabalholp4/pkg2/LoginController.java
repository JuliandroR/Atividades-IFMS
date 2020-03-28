/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholp4.pkg2;

/**
 *
 * @author renato
 */
public class LoginController {
    private Usuario usuario;
    
    public LoginController(){
        novo();
    }
    
    public boolean efetuarLogin(){
        if(usuario.getLogin().equals("admin") && usuario.getSenha().equals("admin")){
            return true;
        }else{
            return false;
        }
    }
    
    public void novo(){
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }
       
}
