import javax.swing.JOptionPane;

public class SomarDois {
  public static void main (String[] args){
    // String aux = JOptionPane.showInputDialog("Digite o primeiro numero"); 
    int aux1 = Integer.parseInt(
      JOptionPane.showInputDialog("Digite o primeiro numero:")
    );

    int aux2 = Integer.parseInt(
      JOptionPane.showInputDialog("Digite o segundo numero:")
    );

    JOptionPane.showMessageDialog(null, "Resultado:\n" + soma(aux1, aux2));

  }

  public static int soma (int n1, int n2){
    return n1 + n2;
  } 
}
