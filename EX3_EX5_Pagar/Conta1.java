package EX3_EX5_Pagar;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Conta1 implements metodosDEPagamento{
    
    double saldo;

    public Conta1(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void calcularPagamento() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quanto deseja pagar");
        double n1 = teclado.nextInt();
        
       double saldof =saldo + n1;
        System.out.println("O saldo agora eh : "+saldof);
    }
    
    
    

}

class conta2 implements metodosDEPagamento{

    double saldo;

    public conta2(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void calcularPagamento() {
 Scanner teclado = new Scanner(System.in);
        System.out.println("Quanto deseja pagar");
        double n1 = teclado.nextInt();
        
       double sf =saldo + n1;
        System.out.println("O saldo agora eh : "+sf);    }
    
}