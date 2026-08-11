
package Empresa;


public class TestaTudo {

    public static void main(String[] args) {
       
     Funcionario f = new Funcionario();
       
       f.setNome("Funcionário Exemplo");
       f.setIdade(23);
       f.setCargo("Professor de muay thai");     
       f.setSalario(5000.);
       f.setCadastro(270107);
       f.setCpf("00000000000");
       
       
     Clientes c = new Clientes();
    
       c.setNome("Cliente Exemplo");    
       c.setIdade(24);
       c.setCpf("11111111111");
       c.setMatricula(12345678);
       c.setPlano("trimestral");
       c.setCadastro(193315);
       c.setMensalidadePaga(true);
       
       
       f.consultaDados();
       c.verificarPagamento();
       c.consultaDados();     
    }
    
}
