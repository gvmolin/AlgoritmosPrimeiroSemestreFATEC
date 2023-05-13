import java.util.Arrays;
import java.util.Scanner;
public class ExercicioTres {
    public static void main(String[] args){
        executarExercicio();
    }

    //. Escreva um algoritmo que leia um numero inteiro entre 100 e 999 e imprima na saída cada um dos algarismos que compoem o numero
    public static void executarExercicio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor:\n");
        int valorUm = scanner.nextInt();
        System.out.print("Digite o segundo valor, diferente do primeiro:\n");
        int valorDois = scanner.nextInt();
        scanner.close();
        
        int[] valores = {valorUm, valorDois};
        Arrays.sort(valores);

        int somaDosPares = 0;
        int multDosImpares = 1;

        for(int i = valores[0]; i <= valores[1]; i++){
            if(i % 2 == 0){
                somaDosPares += i;
            } else {
                multDosImpares = multDosImpares * i;
            }
        }

        System.out.println("Entre os números" + valores[0] + " e " + valores[1]);
        System.out.println("\nA soma dos pares é de: " + somaDosPares);
        System.out.println("\nA multiplicação dos impares é: " + multDosImpares);

    }
}
