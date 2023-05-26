// Ler dois conjuntos de numeros reais, armazenando-os em vetores e calcular o produto ´
// escalar entre eles. Os conjuntos tem 5 elementos cada. Imprimir os dois conjuntos e o ˆ
// produto escalar,

import java.util.Arrays;
public class ExercicioUm {

    public static void main(String[] args){
        int[] array1 = {2,3,4,5,6};
        int[] array2 = {2,3,4,5,6};
        int[] result = new int[5];

        for(int i = 0; i < 5; i++){
            result[i] = array1[i] * array2[i];
        }

        //método fácil de imprimir
        System.out.println("Os valores do primeiro conjunto são:" + Arrays.toString(array1));
        System.out.println("Os valores do segundo conjunto são:" + Arrays.toString(array2));

        //método convencional
        System.out.print("O produto escalar entre os conjuntos é composto pelos números: [");
        for(int i : result){
            System.out.print(Integer.toString(i) + ", ");
        }
        System.out.println("]");
    }
}
