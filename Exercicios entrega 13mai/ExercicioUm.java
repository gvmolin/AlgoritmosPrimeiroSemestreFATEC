import java.util.Scanner;
public class ExercicioUm {
    public static void main(String[] args){
        executarExercicio();
    }

    //. Faca um programa que leia um numero inteiro positivo par N e imprima todos os numeros pares de 0 ate N em ordem decrescente.
    public static void executarExercicio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro e par:\n");
        int limite = scanner.nextInt();
        scanner.close();

        // System.out.print(limite % 2 == 0);
        if(limite % 2 == 0){
            System.out.print("A lista de números pares ficará: ");
            for(int i = 0; i <= limite; i++){
                if(i % 2 == 0 && i != limite){
                    System.out.print(i + ",");
                } else if (i == limite) {
                    System.out.print(i + ".");
                }
            }
        } else {
            System.out.print("Valor inválido: não é par.");
        }
        
    }
}