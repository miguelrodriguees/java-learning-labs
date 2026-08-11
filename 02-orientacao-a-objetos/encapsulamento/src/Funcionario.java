
public class Funcionario {
    private String nome;
    private double salario;
    private int codigoFunc;
  
            
     public String getNome(){
    return this.nome;
    }
    
     public double getSalario(){
    return this.salario;
    }
     public int getCodigoFunc(){
    return this.codigoFunc;
    }
    
     public void setNome(String nome){
    this.nome = nome;
    }
     
     public void setSalario(double salario){
    this.salario = salario;    
    }
    
     public void setCodigoFunc(int codigoFunc){
    this.codigoFunc = codigoFunc;
     }
     
    
     
     void deposita (double valor){
           this.salario += valor;   
     }
    
     double consultaSaldoDisponivel(){
        return this.salario;
      }
     
     void consultaDados(){
       System.out.println("nome: " + this.nome);
       System.out.println("Salario R$ " + this.salario );
       System.out.println("Salario " + this.salario );
   }
       
}
     
     
     

