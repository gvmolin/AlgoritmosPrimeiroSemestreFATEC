import javax.swing.JOptionPane;

public class Calculos{
    public static void main(String[] args) {
        calcularDesconto();
        
    }

    public static void calcularDistancia(){
        double x1 = Double.parseDouble(
            JOptionPane.showInputDialog("Insira o numero x1:")
        );
        double x2 = Double.parseDouble(
            JOptionPane.showInputDialog("Insira o numero x2:")
        );
        double y1 = Double.parseDouble(
            JOptionPane.showInputDialog("Insira o numero y1:")
        );
        double y2 = Double.parseDouble(
            JOptionPane.showInputDialog("Insira o numero y2:")
        );

        double res = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));

        JOptionPane.showMessageDialog(null,"A distancia é igual a " + res);
    }

    public static void calcularDesconto(){
        double valor = Double.parseDouble(
            JOptionPane.showInputDialog("Insira o valor do produto:")
        );
        double porcentagem = Double.parseDouble(
            JOptionPane.showInputDialog("Insira o desconto:")
        );
        double x = valor / 100.00;
        double y = x * porcentagem;

        double res = valor - y;

        JOptionPane.showMessageDialog(null,"O valor com desconto é R$" + res + "\n" + "O desconto foi de R$" + y);
    }
}