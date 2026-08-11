
public class Moto implements Veiculo {
    
    private String marca = "Triumph";
    private String modelo = "Tiger 1200";
    private int velocidade = 60;

    @Override
    public void acelerar() {
        velocidade += 8;
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
        System.out.println("MOTO");
        System.out.println("Marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + "km/h");
   }
}   
