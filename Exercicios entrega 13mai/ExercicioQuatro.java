import java.util.Scanner;
public class ExercicioQuatro {
    public static void main(String[] args){
        executarExercicio();
    }

    //.Fac¸a um programa que leia um valor n inteiro e positivo e apresente o valor da série harmonica 
    public static void executarExercicio(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        double soma = 0.0;
        for (int i = 1; i <= numero; i++) {
            soma += 1.0 / i;
        }
        
        System.out.println("Valor da série harmônica até " + numero + ": " + soma);
        
        scanner.close();
    }
}