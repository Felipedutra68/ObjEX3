package EX3_EX6_Eletronicos;

/**
 *
 * @author ADM
 */
public class Dispositivos implements MetodosEletronicos {

    boolean ligado;

    public Dispositivos(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("A TV esta ligando...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("A TV esta desligando...");
    }

    @Override
    public void ObterStatus() {
        System.out.println("A tv esta ligada? " + ligado);
    }

}

class radio implements MetodosEletronicos {

    boolean ligado;

    public radio(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("O radio esta ligando...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("O radio esta desligando...");
    }

    @Override
    public void ObterStatus() {
        System.out.println("O radio esta ligado? " + ligado);
    }

}

class celular implements MetodosEletronicos {

    boolean ligado;

    public celular(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("O celular esta ligando...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("O celular esta desligando...");
    }

    @Override
    public void ObterStatus() {
 System.out.println("O celular esta ligado? " + ligado);
    }
}
