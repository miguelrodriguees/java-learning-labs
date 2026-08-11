
package listas;

import java.util.ArrayList;

public class ArrayLista {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("Goiaba");
        frutas.add("Morango");
        frutas.add(0, "Banana");
        frutas.add("Maçã");
        frutas.add("Laranja");
       
        System.out.println("ArrayList -> " + frutas);
        System.out.println("Posição -> " + frutas.get(2));
    }
    
}
