
public class TestaFuncionario {

   
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Gerente Exemplo");
        g.setSalario(2000);
        
        g.setUsuario("gerente.demo");
        g.setSenha("senha-de-exemplo");
        
        Telefonista t = new Telefonista();
        t.setNome("Telefonista Exemplo");
        t.setSalario(3000);
        
        t.getEstacaoDeTrabalho();
        
        
       Secretaria s = new Secretaria();
       
        s.setNome("Secretária Exemplo");
        s.setSalario(1000);
       
        s.setRamal(1234);
        
        g.consultaDados();
        t.consultaDados();
        s.consultaDados();
    }
}
    
        //System.out.println("nome do gerente: " + g.getNome());
        //System.out.println("salario gerente: " + g.getSalario());
        //System.out.println("usuario gerente: " + g.getUsuario());
        //System.out.println("senha gerente: " + g.getSenha()); 
        //System.out.println("bonificação do gerente: " + g.calculaBonificacao());
        
        //System.out.println("nome telefonista: " + t.getNome());
        //System.out.println("salarrio telefonista: " + t.getSalario());
        //System.out.println("estação de trabalho da telefonista: " + t.getEstacaoDeTrabalho());
        //System.out.println("bonificação telefonista: " + t.calculaBonificacao());
        
        
        //System.out.println("nome da secretaria: " + s.getNome());
        //System.out.println("salario da secretaria: " + s.getSalario());
        //System.out.println("ramal da secretaria: " + s.getRamal());
        //System.out.println("bonificação da secretaria: " + s.calculaBonificacao());
        


    
    

