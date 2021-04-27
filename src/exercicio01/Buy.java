package exercicio01;

import javax.swing.JOptionPane;

public class Buy {
	public static void main(String[] args) {
		String strPurchasePrice = JOptionPane.showInputDialog("Insira o valor do produto ");
		double valueBuy = Double.parseDouble(strPurchasePrice);
		
		String strDiscount = JOptionPane.showInputDialog("Insira o valor do desconto ");
		double discount = Double.parseDouble(strDiscount);
		
		double discountedValue = valueBuy - (valueBuy * (discount/100));
		String text = Double.toString(discountedValue).replace(".", ",");
		
		JOptionPane.showMessageDialog(null, "O valor com desconto fica de R$"+ text);
	}
}