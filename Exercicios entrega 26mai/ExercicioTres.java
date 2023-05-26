import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite SEIS numeros separados em virgulas, nao se preocupe com espacos, em seguida aperte enter. O programa retornara os resultados:");
        String entrada = scanner.nextLine();
        scanner.close();

        String entradaSemEspaços = entrada.replaceAll("\\s", "");
        String[] arrayStr = entradaSemEspaços.split(",");

        if(arrayStr.length != 6){
            throw new Error("O programa aceita 6 numeros!!!", null);
        }

        int somaDosPares = 0;
        int somaDosImpares = 0;
        String pares = "";
        String impares = "";
        for(int i = 0; i < arrayStr.length; i++ ) {
            if(Integer.parseInt(arrayStr[i]) % 2 == 0){
                somaDosPares += Integer.parseInt(arrayStr[i]);
                pares += (arrayStr[i] + ", ");
            } else {
                somaDosImpares += Integer.parseInt(arrayStr[i]);
                impares += (arrayStr[i] + ", ");
            }
        }

        System.out.println(
            "Numeros pares: " + pares + "\n" + 
            "Números impares: " + impares + "\n" + 
            "Soma dos pares: " + Integer.toString(somaDosPares) + "\n" +
            "Soma dos impares: " + Integer.toString(somaDosImpares) + "\n"
        );

    }
    
}
