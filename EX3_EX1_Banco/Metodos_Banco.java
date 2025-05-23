package EX3_EX1_Banco;

/**
 *
 * @author ADM
 */
public interface Metodos_Banco {
    
    public abstract void depositar(double valor);

    public abstract void sacar(double valor);
    
    double getSaldo();
}
