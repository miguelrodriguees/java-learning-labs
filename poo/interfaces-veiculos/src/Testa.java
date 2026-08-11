
public class Testa {

    public static void main(String[] args) {
   
     Veiculo[] veiculo = {
            new Carro(),
            new Moto(),
            new Bicicleta(),
            new Onibus()
        };

    for (Veiculo v : veiculo) {
         v.acelerar();
         v.acelerar();
         v.acelerar();
         v.frear();
         v.exibirInfo();
    }
  }
}

    

