package EX3_EX7_Pagamento;

/**
 *
 * @author ADM
 */
public class Cartao implements Pagamenrtos {

    double depositar;

    public Cartao(double depositar) {
        this.depositar = depositar;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    @Override
    public void Pagamento(double valor) {
        valor+=depositar;
        System.out.println("Saldo atual: "+valor);
    }
    
    
    
}


class boleto implements Pagamenrtos{
    
    
    
    double depositar;

    public boleto(double depositar) {
        this.depositar = depositar;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    @Override
    public void Pagamento(double valor) {
         valor+=depositar;
        System.out.println("Saldo atual: "+valor);
    }
}


class Dinheiro implements Pagamenrtos{

     double depositar;

    public Dinheiro(double depositar) {
        this.depositar = depositar;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    @Override
    public void Pagamento(double valor) {
         valor+=depositar;
        System.out.println("Saldo atual: "+valor);
        
    }
    
    
}


