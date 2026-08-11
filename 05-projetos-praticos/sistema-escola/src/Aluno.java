
public class Aluno extends UsuarioEscola{
   private double mediaNotas;
   private String turma;
   private String curso;
   private String frequencia;

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double notas) {
        this.mediaNotas = notas;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
   
    public void consultaDados(){
      super.consultaDados();
        
        System.out.println("Média de notas do aluno: " + getMediaNotas());
        System.out.println("Turma do aluno: " + getTurma());
        System.out.println("Curso do aluno: " + getCurso());
        System.out.println("Frequecia do aluno: " + getFrequencia());
        
    }
    public void calcularMedia(){
        if (mediaNotas >= 6.0) {
            System.out.println("Você passou de ano");
        } else {
            System.out.println("Você precisa melhorar a média");
        }
    }
   
    }

