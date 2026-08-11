
package Empresa;


public class UsuarioAcademia {
    private String nome;
    private int idade;
    private String cpf;
    private int cadastro;
    private boolean mensalidadePaga;
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getCadastro() {
        return cadastro;
    }
    
    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }
    
    public boolean getMensalidadePaga() {
    return mensalidadePaga;
    }

    public void setMensalidadePaga(boolean mensalidadePaga) {
        this.mensalidadePaga = mensalidadePaga;
    }

 
    public void consultaDados(){
       System.out.println("Nome: " + getNome());
       System.out.println("Idade: " + getIdade());
       System.out.println("cpf: " + getCpf());
       System.out.println("cadastro: " + getCadastro());
       //System.out.println("-------------------------------");
}
    
    public void verificarPagamento(){

        if(mensalidadePaga){
            System.out.println("Mensalidade em dia");
        } 

        else{
            System.out.println("Mensalidade pendente");
        }
    }
    
}

