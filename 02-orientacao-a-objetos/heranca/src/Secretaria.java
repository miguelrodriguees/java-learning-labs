
public class Secretaria extends Funcionario {
    
    private int ramal;

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

   public void consultaDados(){
        System.out.println("                ");
        System.out.println("DADOS DA SECRETARIA: ");        
        System.out.println("ramal da secretaria: " + this.ramal);      
        System.out.println("nome da secretaria: " + this.getNome());
        System.out.println("salario da secretaria: " + this.getSalario());
        System.out.println("ramal da secretaria: " + this.getRamal());
        System.out.println("bonificação da secretaria: " + this.calculaBonificacao());
        System.out.println("-------------------------------");
   }
}

