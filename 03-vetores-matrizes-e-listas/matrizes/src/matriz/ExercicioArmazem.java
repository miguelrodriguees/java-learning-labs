package matriz;

import java.util.Scanner;
        
public class ExercicioArmazem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[][] armazem = new int[3][4];          

       for (int i = 0; i < armazem.length; i++) {
            System.out.println("Seção " + (i + 1));
         for (int j = 0; j < armazem[i].length; j++) {
                System.out.print("Prateleira " + (j + 1) + ": ");
                armazem[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < armazem.length; i++){
          int soma = 0;
            for(int j = 0; j < armazem[i].length; j++){
                soma += armazem[i][j];
            }
            System.out.println("Total da Seção " + (i + 1) + ": " + soma);
        }
    
        int maior = armazem[0][0];
        int secao = 0;
        for (int i = 0; i < armazem.length; i++) {
            for (int j = 0; j < armazem[i].length; j++) {
            if (armazem[i][j] > maior) {
                maior = armazem[i][j];
                secao = i;
         }
      }
        System.out.println("Seção com mais produtos: " + (secao + 1));
        }
   }
}
        
    

