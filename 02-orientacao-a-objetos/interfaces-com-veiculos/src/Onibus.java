
public class Onibus implements Veiculo {
    
    private String marca = "Mercedes-Benz";
    private String modelo = "Articulado";
    private int velocidade = 35;

    @Override
    public void acelerar() {
        velocidade += 5;
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
        System.out.println("ONIBUS");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + "km/h");
        System.out.println("-------------------------");
   }
}   
              
