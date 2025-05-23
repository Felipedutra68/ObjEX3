package EX3_EX9_Contas;

/**
 *
 * @author ADM
 */
public class Adm implements MatodosContas{

    public Adm() {
    }

    @Override
    public void Acessar() {
        System.out.println("Acesso consedido");
    }

    @Override
    public void RealizarOp() {
        System.out.println("Permisao consedida");
                
    }
    
    
    

}


class Funcionario implements MatodosContas{

    public Funcionario() {
    }

    @Override
    public void Acessar() {
           System.out.println("Acesso consedido");
    }

    @Override
    public void RealizarOp() {
        System.out.println("Acesso negado");
    }

    
    
    
    
}
