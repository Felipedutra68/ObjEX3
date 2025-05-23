package EX3_EX15_Calculadora;

/**
 *
 * @author ADM
 */
public class Calculadora implements MetodosCalculadora {

    public Calculadora() {
    }

    @Override
    public void calcular(double a, double b) {
        a = +b;
        System.out.println("O resultado eh: " + a);
    }

}

class subtracao implements MetodosCalculadora {

    public subtracao() {
    }

    @Override
    public void calcular(double a, double b) {
        a = -b;
        System.out.println("O resultado eh: " + a);
    }

}

class multiplicacao implements MetodosCalculadora {

    public multiplicacao() {
    }

    @Override
    public void calcular(double a, double b) {
        double r = a *b;
        System.out.println("O resultado eh: " + r);
    }

}



class divisao implements MetodosCalculadora{

    public divisao() {
    }

    @Override
    public void calcular(double a, double b) {
         double r = a /b;
        System.out.println("O resultado eh: " + r);
        
    }
    
    
    
    
    
}