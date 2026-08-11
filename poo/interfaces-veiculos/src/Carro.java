
public class Carro implements Veiculo {
    
    private String marca = "Volkswagem";
    private String modelo = "T-CROSS";
    private int velocidade = 80;
    
    @Override
    public void acelerar() {
        velocidade += 10;
    }

    @Override
    public void frear() {
        velocidade -= 10;

        if (velocidade < 0) {
            velocidade = 0;
        }
    }
 
   @Override
    public void exibirInfo(){
        System.out.println("-------------------------");
        System.out.println("CARRO");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + "km/h");
   }
}   
           
    
