
public class Gato extends Animal {
    public Gato(String nome){
    super(nome);
    }

    
    @Override
    public void emitirSom(){
    System.out.println("miau"); 
  
    }

    @Override
    public void dormir() {
        System.out.println("O gato está dormindo");
    }
}
