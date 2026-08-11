
package orientacaoobjeto;

public class Servicos {
    private String nomeServico;
    private int codigoServico;
    private String dataDeContratacao;

    public Servicos(){
        System.out.println("realizei a ação de construtor");
    }
          
    public Servicos(String nomeServico){
       this.nomeServico = nomeServico;
    }
     
    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public int getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(int codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(String dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }
    
    public double calculaTaxa(){
    return 10;
    }
}




