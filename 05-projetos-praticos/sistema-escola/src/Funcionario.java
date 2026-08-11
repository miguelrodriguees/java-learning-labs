
public class Funcionario extends UsuarioEscola {
    private String cargo;
    private double salario;
    private String cargaHoraria;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
   
    public void consultaDados(){
      super.consultaDados();       
        System.out.println("Cargo do funcionário: " + getCargo());
        System.out.println("salário do funcionário: " + getSalario());
        System.out.println("Carga horária do funcionário: " + getCargaHoraria());
        
    
    }
    
}
