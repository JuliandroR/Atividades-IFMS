
public class ContatoNaoExisteException extends Exception {
    
    @Override
    public String getMessage(){
        return "Contado não encontrado, desculpe '-'";
    }
    
}
