import javax.swing.JOptionPane;

public class ConversorTemp {
  public static void main(String[] args){
    Double celsius = Double.parseDouble(
      JOptionPane.showInputDialog("Digite o valor em Celsius:")
    );
    JOptionPane.showMessageDialog(null, "Resultado em Fahrenheit:\n" + converter(celsius));
  }  

  public static Double converter(Double c){
    Double res = ((9.0 / 5.0) * c) + 32;
    return res;
  }
}
