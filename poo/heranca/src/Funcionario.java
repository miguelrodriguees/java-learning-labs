
public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculaBonificacao(){
    return this.salario * 0.1;
   
    }
   
   
    public void consultaDados(){
       System.out.println("FUNCIONÁRIOS: ");
       System.out.println("Nome do funcionário: " + this.nome);
       System.out.println("Salario R$: " + this.salario);
       System.out.println("Bonificação: " + this.calculaBonificacao());
       System.out.println("-------------------------------");
    }
}

