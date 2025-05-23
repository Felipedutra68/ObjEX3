package EX3_EX3_Geometrico;

/**
 *
 * @author ADM
 */
public class Retangulo implements Calculos {

    double altura;
    double base;
    private double raio;

    public Retangulo(double a, double b) {

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

class circulo implements Calculos {

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
