
public class TestaTudo {

    public static void main(String[] args) {
  
        
      Funcionario f = new Funcionario();
      
      System.out.println("Funcionário: ");
      f.setNome("Funcionário Exemplo");
      f.setDataDeNasc ("13/12/1986 ");
      f.setCpf("00000000000");
      f.setCodigoUsuario("9513576");
      f.setCargo("Diretor ");
      f.setCargaHoraria("50 horas semanais");
      f.setSalario(6500);
      
      
      Professor p = new Professor();
      
      p.setNome("Professor Exemplo");
      p.setDataDeNasc ("05/05/1993 ");
      p.setCpf("11111111111");
      p.setCodigoUsuario("7893025");
      p.setMateria("História");
      p.setCargaHoraria("40 horas semanais");
      p.setSalario(5300);
      
      
      Aluno a = new Aluno();
      
      a.setNome("Aluno Exemplo");
      a.setDataDeNasc ("13/06/1988 ");
      a.setCpf("22222222222");
      a.setCodigoUsuario("3067891");
      a.setMediaNotas(8.2);
      a.setTurma("Laboratório 45");
      a.setCurso("Técnico em informática");
      a.setFrequencia("93%");
      a.calcularMedia();
      
      
      
      f.consultaDados();
        System.out.println("--------------------------------------");
           
      p.consultaDados();
        System.out.println("--------------------------------------");
             
      a.consultaDados();
      
    } 
    
}
