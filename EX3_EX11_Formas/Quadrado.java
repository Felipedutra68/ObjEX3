package EX3_EX11_Formas;

/**
 *
 * @author ADM
 */
public class Quadrado implements MetodosGeometricos {

double altura;
    double base;
    private double raio;

    public Quadrado(double a, double b) {

        this.altura = a;
        this.altura = b;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        this.base = b;
    }

    @Override
    public void Area() {
 double ar = altura * base;
        System.out.println("A area eh: " + ar);
    }

    @Override
    public void perimetro() {
 double pe = (altura + base) * 2;
        System.out.println("O perometro eh: " + pe);
    }
    

}

class circulo implements MetodosGeometricos {

    private double raio;

    public circulo(double r) {

        this.raio = r;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

   
    @Override
    public void Area() {
 double ar1 = Math.PI * (raio * raio);
        System.out.println("A area eh: " + ar1);
    }

    @Override
    public void perimetro() {
double ar2 = 2 * Math.PI * raio;
        System.out.println("O perimetro eh eh: " + ar2);
    }

    

}



class triangulo implements MetodosGeometricos {

double altura;
    double base;
    double l1;
    double l2;
    double l3;

    public triangulo(double altura, double base, double l1, double l2, double l3) {
        this.altura = altura;
        this.base = base;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

   

    public double getAltura() {
        return altura;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        this.base = b;
    }

    @Override
    public void Area() {
      double a = (altura*base)/2;
       System.out.println("A area eh: " + a);
      
    }

    @Override
    public void perimetro() {
   double per = l1+l2+l3;
   System.out.println("O perimetro eh eh: " + per);
   
    }
}