package EX3_EX4_Comparable;

/**
 *
 * @author ADM
 */
public class Pessoas implements Comparable {

    String nome;
    int idade;

    public Pessoas(String n, int i) {
        this.nome = n;
        this.idade = i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void compararIdades() {
        if(idade >= 50 ) {
        
            System.out.println("Velho");    
            
        }else{
            System.out.println("Novo");
            
        }
        }
    }
    
    
    

