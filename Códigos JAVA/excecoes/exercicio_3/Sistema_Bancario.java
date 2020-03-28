
public class Sistema_Bancario {
    Integer Saldo;
    Integer limite;

    public Integer Sacar(Integer valor) {
        if (valor > this.limite) {
            this.Saldo = this.Saldo - valor;
        }
        
        return this.Saldo;
    }

    public Integer Deposito(Integer valor) {
        this.Saldo = this.Saldo + valor;
        return this.Saldo;
    }

    public void setValorLimite(Integer valor) {
        this.limite = valor;
    }
    
}
