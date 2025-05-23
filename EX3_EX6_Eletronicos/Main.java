package EX3_EX6_Eletronicos;

/**
 *
 * @author ADM
 */
public class Main {

    public static void main(String[] args) {

        Dispositivos Dis = new Dispositivos(true);

        Dis.ligar();
        Dis.desligar();
        Dis.ObterStatus();

        radio r = new radio(true);

        r.ligar();
        r.desligar();
        r.ObterStatus();

        celular c = new celular(true);

        c.ligar();
        c.desligar();
        c.ObterStatus();

    }

}
