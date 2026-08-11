
package Empresa;

public class Funcionario extends UsuarioAcademia {
    
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
    
    public String getCargaHoraria(){
        return cargaHoraria; 
    }
    
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void consultaDados(){
     
        super.consultaDados();        
        System.out.println("cargo do funcionario: " + getCargo());
        System.out.println("salário do funcionario: " + getSalario());  
        //System.out.println("carga horaria do funcionario:" + getCargaHoraria());
        System.out.println("-------------------------------");       
             
    }
    
}

