
public class Telefonista extends Funcionario {
    private int estacaoDeTrabalho;

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
    
    @Override
   public void consultaDados(){
        System.out.println("                ");
        System.out.println("DADOS DO TELEFONISTA: ");
        System.out.println("estação de trabalho da telefonista: " + this.estacaoDeTrabalho);      
        System.out.println("nome telefonista: " + this.getNome());
        System.out.println("salarrio telefonista: " + this.getSalario());
        System.out.println("bonificação telefonista: " + this.calculaBonificacao());
        System.out.println("-------------------------------");
   }
}
