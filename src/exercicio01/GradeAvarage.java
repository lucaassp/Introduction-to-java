package exercicio01;

import javax.swing.JOptionPane;

public class GradeAvarage {
	public static void main(String[] args) {
		String strNote1 = JOptionPane.showInputDialog("Insira a nota 1: ");
		double note1 = Double.parseDouble(strNote1);
		
		String strNote2 = JOptionPane.showInputDialog("Insira nota 2: ");
		double note2 = Double.parseDouble(strNote2);
		
		double avarage = (note1 + note2) / 2;
		
		JOptionPane.showMessageDialog(null, "A média é: " + avarage);
		
	}
}
