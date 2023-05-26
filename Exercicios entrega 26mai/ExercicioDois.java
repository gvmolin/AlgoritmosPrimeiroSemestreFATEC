// Leia 10 numeros inteiros e armazene em um vetor. Em seguida escreva os elementos ´
// que sao primos e suas respectivas posic¸ ˜ oes no vetor. 
import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma lista de números separados em virgulas, não se preocupe com espaços, em seguida aperte enter. O programa encontrará os que são primos...");
        String entrada = scanner.nextLine();
        scanner.close();

        String entradaSemEspaços = entrada.replaceAll("\\s", "");
        String[] arrayStr = entradaSemEspaços.split(",");

        for(int i = 0; i < arrayStr.length; i++ ) if(checarPrimo(Integer.parseInt(arrayStr[i]), i))
            System.out.println(
                "O numero: " + 
                arrayStr[i] + 
                " é primo, e sua posição é a numero " +
                Integer.toString(i + 1) +
                " do vetor."
            );
    }

    public static boolean checarPrimo(int numero, int index){
        for(int j = 2; j < numero; j++){
            if(numero % j == 0) return false;
        }
        return true;
    }
}
