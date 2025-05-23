package EX3_EX1_Banco;

/**
 *
 * @author ADM
 */
public class Banco implements Metodos_Banco {

   private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    
    
    @Override
    public void depositar(double valor) {
 saldo += valor;
    System.out.println("Deposito de R$"+valor+" realizado com sucesso.\nNovo saldo: R$"+saldo);
        }

    @Override
    public void sacar(double valor) {
saldo -= valor;
    System.out.println("O saque de R$"+valor+" foi realizado com sucesso.\nNovo saldo: R$"+saldo);    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    
   
   
   
   
}
