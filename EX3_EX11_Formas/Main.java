package EX3_EX11_Formas;

/**
 *
 * @author ADM
 */
public class Main {
         public static void main(String[] args) {
    
    Quadrado Q = new Quadrado(2,3);
   
    Q.Area();
    Q.perimetro();
    
    circulo c = new circulo(2);
    c.Area();
    c.perimetro();
    
    
     triangulo t = new triangulo(5,5,1,1,1);
    t.Area();
    t.perimetro();
    
         }
}
