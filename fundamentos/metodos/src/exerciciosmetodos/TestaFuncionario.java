
package exerciciosmetodos;

public class TestaFuncionario {

    public static void main(String[] args) {
       Funcionario func1 = new Funcionario ();
       Funcionario func2 = new Funcionario ();
       
       func1.nome = "Funcionário 1";
       func1.salario = 3000;
       
       func1.deposita(2500);
       func1.consultaDados();
         
       
       func2.nome = "Funcionário 2";
       func2.salario = 1500;
       
       func2.deposita(3000);
       func2.consultaDados();   
             
    }
    
}
