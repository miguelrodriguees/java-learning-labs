
public class Gerente extends Funcionario{
   private String usuario;
   private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    @Override
    public double calculaBonificacao(){
    return this.getSalario() * 0.6 + 100;
    }
    
    @Override
   public void consultaDados(){
       System.out.println("                ");
       System.out.println("DADOS DO GERENTE: ");
       System.out.println("Usuario do gerente: " + this.usuario);
       System.out.println("senha do gerente: " + this.senha );
       System.out.println("nome do gerente: " + this.getNome() );
       System.out.println("salário do gerente: " + this.getSalario() );      
       System.out.println("-------------------------------");
   }
}
   
   

