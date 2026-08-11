
public class MatrizIA {


    public static void main(String[] args) {         

        int [][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Elemento da linha 1, coluna 2: " + matriz[0][1]);
        System.out.println("Elemento da linha 3, coluna 1: " + matriz[2][0]);

        System.out.println("-------------------------");

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matriz2 = new int[4][4];

        matriz2[1][1] = 1;
        matriz2[1][2] = 2;
        matriz2[1][3] = 3;
        matriz2[2][1] = 4;
        matriz2[2][2] = 5;
        matriz2[2][3] = 6;
        matriz2[3][1] = 7;
        matriz2[3][2] = 8;
        matriz2[3][3] = 9;

        System.out.println("Elemento da linha 1, coluna 2: " + matriz2[1][2]);
        System.out.println("Elemento da linha 3, coluna 1: " + matriz2[3][1]);

        int soma = 0;

        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                soma += matriz2[i][j];
            }
        }

        System.out.println("Soma: " + soma);

        int maior = matriz[0][0];

        for (int[] linha : matriz){
            for (int valor : linha){
                if (valor > maior){
                    maior = valor;
                }
            }
        }

        System.out.println("Maior elemento: " + maior);

        int menor = matriz[0][0];

        for (int[] linha : matriz){
            for (int valor : linha){
                if (valor < menor){
                    menor = valor;
                }
            }
        }

        System.out.println("Menor elemento: " + menor);
    }
}
    
    

