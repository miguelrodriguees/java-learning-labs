
package listas;

import java.util.LinkedList;

public class LinkedLista {

  
    public static void main(String[] args) {
        LinkedList<String> frutas = new LinkedList<>();
        
        frutas.add("Goiaba");
        frutas.add("Uva");
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Laranja");
        frutas.addFirst("Morango");
        frutas.add(1,"Caju");
        
        
        
        System.out.println("Frutas -> " + frutas);
        System.out.println("Posição 2 -> " + frutas.get(3));
    
    }
    
}
