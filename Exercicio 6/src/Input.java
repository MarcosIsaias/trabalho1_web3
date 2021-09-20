import javax.swing.JOptionPane;

public class Input {
	public Double InformarValor(String mensagem) {
		return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
	}

}
