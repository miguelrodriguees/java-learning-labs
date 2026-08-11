
package exerciciosmetodos;

public class Funcionario {
   String nome;
   double salario;
   
        void deposita (double valor){
           this.salario += valor;   
        }
      
        double consultaSaldoDisponivel(){
        return this.salario;
        }
        void consultaDados(){
            System.out.println("nome: " + this.nome);
            System.out.println("Salario R$ " + this.salario);
        }
}
