
public class UsuarioEscola {
   private String nome;
   private String dataDeNasc; 
   private String cpf;
   private String codigoUsuario;
   
   /*private double nota1;
   private double nota2;
   private double nota3;
   private double nota4;*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNasc() {
        return dataDeNasc;
    }

    public void setDataDeNasc(String dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    
   
    public void consultaDados(){       
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataDeNasc());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Código do usuario: " + getCodigoUsuario());
      
    }
    
}
