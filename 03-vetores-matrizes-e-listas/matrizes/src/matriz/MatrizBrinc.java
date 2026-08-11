
package matriz;

import java.util.Scanner;

public class MatrizBrinc {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Notas dos alunos
        int[][]notas = new int[3][4];
        
        for(int i = 0; i < notas.length; i++){
        System.out.println("aluno" + (i + 1));
        
        int soma = 0;
        for(int j = 0; j < notas[i].length; j++){
            System.out.print("Nota " + (j + 1) + ": ");
            notas[i][j] = sc.nextInt();
           
            if(notas[i][j] < 0 || notas[i][j] > 10){
               System.out.println("A nota precisa estar entre 0 e 10");
               
               while (notas[i][j] < 0 || notas[i][j] > 10){
                   System.out.println("digite novamente a nota" + (j + 1) + ": ");
                   notas[i][j] = sc.nextInt(); 
               }
        }
        }
        double media = (double) soma/notas[i].length;
            System.out.println("Média do aluno" + (i+1) + ": " + media);
            
         
         if(media>=7){
                System.out.println("Aprovado");
                
         }else if (media < 5 ){
             System.out.println("Já era6"
                     + "");           
                      
        }else{
             System.out.println("Vai estudar");      
            }
        }
    }
}
       
    

