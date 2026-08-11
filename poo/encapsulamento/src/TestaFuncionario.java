
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome ("Funcionário Exemplo");
        f.setSalario (2000);
        f.setCodigoFunc (12345678);
        
        f.deposita(2500);
        f.consultaDados();
       
      //System.out.println("nome do funcionario: " + f.getNome());
      //System.out.println("salario do funcionario: " + f.getSalario());
      //System.out.println("código do funcionário: " + f.getCodigoFunc());
        
        
        
        
    }
            
}
