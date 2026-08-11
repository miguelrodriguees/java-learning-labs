import java.util.Arrays;

public class ExercicioVetores {

    public static void main(String[] args) {
        int[] numeros = new int[10];
       
    //Valores
        numeros[0] = 63;
        numeros[1] = 94;
        numeros[2] = 2;
        numeros[3] = 56;
        numeros[4] = 121;
        numeros[5] = 67;
        numeros[6] = 36;
        numeros[7] = 15;
        numeros[8] = 43;
        numeros[9] = 55;              
               
        
    //Calculos
        int soma = 0;
        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            soma += num;

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        double media = (double) soma / numeros.length;

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
                            

    // Inserindo 2 elementos       
    int[] novoVetor = new int[numeros.length + 2];

        for (int i = 0; i < numeros.length; i++) {
            novoVetor[i] = numeros[i];
        }

        novoVetor[10] = 32;
        novoVetor[11] = 88;

        System.out.println("Após inserção: " + Arrays.toString(novoVetor));

       
    // Removendo o último elemento
        int[] vetorRemovido = new int[novoVetor.length - 1];

        for (int i = 0; i < vetorRemovido.length; i++) {
            vetorRemovido[i] = novoVetor[i];
        }

        System.out.println("Após remover último elemento: " + Arrays.toString(vetorRemovido));
    }
}