import javax.swing.JOptionPane;

//ler nome e sobrenome e exibir nome completo
public class MostrarNome {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("digite seu nome");
    String sobrenome = JOptionPane.showInputDialog("digite seu sobrenome");

    String nomeSobrenome = nome + " " + sobrenome;

    JOptionPane.showMessageDialog(null, "nome completo:\n " + nomeSobrenome);  
  }

}
