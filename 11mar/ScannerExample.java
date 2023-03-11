//EXERCICIO: LER O PRÊMIO DA MEGA-SENA E DIVIDI-LO ENTRE TRÊS JOGADORES:
// O PRIMEIRO RECEBE 46%, O SEGUNDO 32% E O TERCEIRO, O RESTANTE.
//EXIBIR O VALOR QUE CADA UM VAI RECEBER;

import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        calculoPremios(46, 32);
        
    }

    public static void calculoPremios(int porcentagem1, int porcentagem2){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do prêmio:");
        double valor = scanner.nextDouble();
        scanner.close();

        double centesimo = valor/100.00;

        double primeiro = porcentagem1 * centesimo;
        double segundo = porcentagem2 * centesimo;
        double terceiro = (100 - porcentagem1 - porcentagem2) * centesimo;

        System.out.print(
            "O primeiro vencedor recebe R$" + String.format("%.2f", primeiro) + 
            "\nO segundo vencedor recebe R$" + String.format("%.2f", segundo) + 
            "\nO terceiro vencedor recebe R$" + String.format("%.2f", terceiro)
        );
    }
}
