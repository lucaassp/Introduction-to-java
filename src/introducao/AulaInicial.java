package introducao;

import javax.swing.JOptionPane;

public class AulaInicial {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Insira seu nome: ");
		
		JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome);
	}
}
