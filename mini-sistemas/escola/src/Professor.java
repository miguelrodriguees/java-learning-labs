
public class Professor extends UsuarioEscola{
    private String materia;
    private String cargaHoraria;
    private double salario;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void consultaDados(){
      super.consultaDados();
        System.out.println("Matéria do professor: " + getMateria());
        System.out.println("Salário do professor:" + getSalario());
        System.out.println("Carga horária do professor:" + getCargaHoraria());
     
    
    }
   
}
