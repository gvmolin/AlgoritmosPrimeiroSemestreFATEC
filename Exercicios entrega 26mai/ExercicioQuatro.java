// . Fac¸a um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a
// intersecc¸ao entre os 2 vetores anteriores, ou seja, que cont ˜ em apenas os n ´ umeros que ´
// estao em ambos os vetores. N ˜ ao deve conter n ˜ umeros repetidos.

import java.util.ArrayList;
public class ExercicioQuatro {
    public static void main(String[]args) {

        int[] arr1 = { 2, 3, 5, 6, 8, 9, 12, 14, 15, 35 };
        int[] arr2 = { 2, 3, 5, 7, 9, 11, 2, 35, 49, 51 };
        ArrayList<Integer> res  = new ArrayList<>();

        for (int n1 : arr1) {
            for (int n2 : arr2) {
                if (n1 == n2 && checarRepetido(res, n1)) {
                    res.add(n1);
                }
            }
        }

        System.out.println(res);
    }

    public static boolean checarRepetido(ArrayList<Integer> arr, int n){
        for(int item : arr){
            if(item == n){
                return false;
            }
        }
        return true;
    }
}
