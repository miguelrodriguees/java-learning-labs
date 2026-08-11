
package orientacaoobjeto;

public class testaGerente {

   
    public static void main(String[] args) {
       Gerente g = new Gerente();
       
       g.nome = "Gerente Exemplo";
       g.salario = 1000;

      g.aumentaSalario(0.01);
        System.out.println("salario com 10% de aumento: " + g.salario);
    
      //g.aumentaSalario(0.015);
        //System.out.println("novo aumento de 15%: " + g.salario);
        
        
    }
    
}
