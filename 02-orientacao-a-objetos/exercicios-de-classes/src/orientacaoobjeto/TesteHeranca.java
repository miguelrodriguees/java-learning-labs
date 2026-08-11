
package orientacaoobjeto;


public class TesteHeranca {

    public static void main(String[] args) {
        
      SeguroDeVeiculo sdv = new SeguroDeVeiculo();
      sdv.setCodigoServico(12345678);
      sdv.setDataDeContratacao("04/08/2008 ");
      sdv.setFranquia(1000);
      sdv.setNomeServico("Seguro de veiculo - T-CROSS 2022 ");
      sdv.setValorSeguroVeiculo(1500);
      
      Emprestimo e = new Emprestimo();
      e.setNomeServico("Empréstimo - Cliente Exemplo");
      e.setCodigoServico(12345678);
      e.setDataDeContratacao("03/03/2016");
      e.setValor(3000);
      e.setTaxa(0.1);
      
        System.out.println(sdv.getNomeServico());
        System.out.println(sdv.getCodigoServico());
        System.out.println(sdv.getDataDeContratacao());
        System.out.println(sdv.getFranquia());
        System.out.println(sdv.getValorSeguroVeiculo());
        System.out.println(sdv.calculaTaxa());
        
        System.out.println(e.getNomeServico());
        System.out.println(e.getCodigoServico());
        System.out.println(e.getDataDeContratacao());
        System.out.println(e.getTaxa());
        System.out.println(e.getValor());
        System.out.println(e.calculaTaxa());
        
        
    }
    
}
