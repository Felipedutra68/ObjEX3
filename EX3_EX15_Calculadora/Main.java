package EX3_EX15_Calculadora;

/**
 *
 * @author ADM
 */
public class Main {
    
      public static void main(String[] args) {
    
    Calculadora c = new Calculadora();
    c.calcular(2, 2);
    
    subtracao s = new subtracao();
    s.calcular(2, 2);
    
    multiplicacao m = new multiplicacao();
    m.calcular(2, 2);
    
    divisao d = new divisao();
    d.calcular(2, 2);
    
  
      }
}
