
package Empresa;


public class Clientes extends UsuarioAcademia{
    private int matricula;
    private String plano;
    private boolean mensalidadePaga;
   
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
    public void consultaDados(){
    
        super.consultaDados();
        System.out.println("Matricula do aluno: " + getMatricula());
        System.out.println("plano do aluno: " + getPlano());
        System.out.println("-------------------------------");
    }
    
    public void verificarPagamento(){
    super.verificarPagamento();
    
    }
}
