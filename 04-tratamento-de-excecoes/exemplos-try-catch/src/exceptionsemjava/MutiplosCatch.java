
package exceptionsemjava;

public class MutiplosCatch {

    public static void main(String[] args) {
       try {
       int[] numeros = {1,2,3,4,5,6,7,8,9,10};
           System.out.println(numeros[3]);
           int resultado = 10 / 0;
       }catch (ArithmeticException e){
           System.out.println("Erro de divisão por 0");
       }catch (ArrayIndexOutOfBoundsException e){   
           System.out.println("Indice do array fora do permitido");
       
       }
    }
    
}
