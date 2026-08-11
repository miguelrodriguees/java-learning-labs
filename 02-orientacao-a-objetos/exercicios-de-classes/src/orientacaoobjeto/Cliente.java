package orientacaoobjeto;


public class Cliente {
    String nome;
    double salario;
          
    
    void aumentaSalario(){
    }
    
    void aumentaSalario(double taxa){
    this.salario += this.salario * taxa;
        
    }
}
