package exercicio01;

import javax.swing.JOptionPane;

public class Imc {
	public static void main(String[] args) {
		String strWeight = JOptionPane.showInputDialog("Insira seu peso: ");
		double weight = Double.parseDouble(strWeight);
		
		String strHeight = JOptionPane.showInputDialog("Insira sua altura: ");
		double height = Double.parseDouble(strHeight);
		
		double imc = weight / (height * height);
		String text = String.format("Seu IMC é %.1f: ", imc);
		
		JOptionPane.showMessageDialog(null, text);
	}
}
