import javax.swing.JOptionPane;

public class Input {
	public Double informarValor(String mensagem) {
		return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
	}
}
