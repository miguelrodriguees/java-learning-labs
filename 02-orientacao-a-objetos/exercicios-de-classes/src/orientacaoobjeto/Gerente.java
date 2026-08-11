
package orientacaoobjeto;
 
 
public class Gerente {
   String nome;
   double salario;

   void aumentaSalario(){
      this.aumentaSalario(0.01);
    }
   
   void aumentaSalario(double taxa){
       this.salario += this.salario * taxa;
    }
}
