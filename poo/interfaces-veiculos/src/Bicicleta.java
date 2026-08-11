public class Bicicleta implements Veiculo {
   
    private String marca = "BMX";
    private String tipo = "BMX freestyle";
    private int velocidade = 5;

    @Override
    public void acelerar() {
        velocidade += 5;
    }

    @Override
    public void frear() {
        velocidade -= 5;

        if (velocidade < 0) {
            velocidade = 0;
        }
    }
 
    @Override
    public void exibirInfo(){
        System.out.println("-------------------------");
        System.out.println("BICICLETA");
        System.out.println("Marca: " + marca);
        System.out.println("tipo: " + tipo);
        System.out.println("Velocidade: " + velocidade + "km/h");
   }
}   
