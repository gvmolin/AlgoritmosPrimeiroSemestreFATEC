import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args){
        executarExercicio();
    }

    //. Escreva um algoritmo que leia um numero inteiro entre 100 e 999 e imprima na saída cada um dos algarismos que compoem o numero
    public static void executarExercicio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro entre 100 e 999:\n");
        int entrada = scanner.nextInt();
        scanner.close();

        if (entrada >= 100 && entrada <= 999) {
            String entradaStr = Integer.toString(entrada);
            String[] numbers = entradaStr.split("");
            System.out.print("\n Os algarismos que compôem o numero '" + entradaStr + "' são: ");
            for(int i = 0; i < numbers.length; i++){
                if(i == numbers.length - 1){
                    System.out.print( numbers[i] + '.' );
                } else if (i == numbers.length - 2){
                    System.out.print( numbers[i] + " e " );
                } else {
                    System.out.print( numbers[i] + ", " );
                }
            }
        } else {
            System.out.print("Número inválido.\n");
        }
    }
}
