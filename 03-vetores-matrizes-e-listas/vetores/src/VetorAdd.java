
import java.util.Arrays;

public class VetorAdd {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        // Inserindo 25 na posição 2
        int[] novoVetor = new int[numeros.length + 1];

        for (int i = 0, j = 0; i < novoVetor.length; i++) {

            if (i == 2) {
                novoVetor[i] = 25; // elemento inserido
            } else {
                novoVetor[i] = numeros[j];
                j++;
            }
        }

        System.out.println("Após inserção: " + Arrays.toString(novoVetor));

        // Removendo elemento da posição 3
        int[] vetorRemovido = new int[novoVetor.length - 1];

        for (int i = 0, j = 0; i < novoVetor.length; i++) {

            if (i != 3) {
                vetorRemovido[j] = novoVetor[i];
                j++;
            }
        }

        System.out.println("Após remoção: " + Arrays.toString(vetorRemovido));
    }
}
