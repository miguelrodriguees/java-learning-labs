package exceptionsemjava;

public class TryCatchFinally {

    public static void main(String[] args) {
        try {
            int resultado = 10 / 5;
            System.out.println("Resultado " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não pode divisão por zero!");
        } finally {
            System.out.println("sempre passo aqui"); 

        }
    }

}
