package EX3_EX7_Pagamento;

/**
 *
 * @author ADM
 */
public class Main {
    
    public static void main(String[] args) {
    
    Cartao c = new Cartao(12);
    c.Pagamento(13);

    
    boleto b = new boleto(12);
    b.Pagamento(13);
    
    Dinheiro d = new Dinheiro(12);
    d.Pagamento(13);
    
    
    }
}
