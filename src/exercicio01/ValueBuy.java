package exercicio01;

import javax.swing.JOptionPane;

public class ValueBuy {
	public static void main(String[] args) {
		
		int amountApple = Integer.parseInt(JOptionPane.showInputDialog("Quantas maçãs você deseja comprar"));
		int amountPapaya = Integer.parseInt(JOptionPane.showInputDialog("Quantos mamões deseja comprar"));
		
		double total = amountApple * 1 + amountPapaya * 3.50;
		JOptionPane.showMessageDialog(null, "O valor total a ser pago é R$" + total);
	}
}
