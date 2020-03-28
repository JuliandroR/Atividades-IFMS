
import java.io.IOException;

public class limpar {
    public void limpar() throws IOException, InterruptedException{
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    }
}
