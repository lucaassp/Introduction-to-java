package exercicio06;

import java.util.Scanner;

public class ProgramaDescontos {
	public static double calculateDiscountAmount(double valueProduct) {
		if (valueProduct < 50) {
			return (valueProduct);
		} else if (valueProduct < 100) {
			return (valueProduct - (valueProduct * 0.05));
		} else {
			return (valueProduct - (valueProduct * 0.10));
		}
	}
	
	public static double sumOfDiscount(Product[] arrayDiscount) {
		double discountAdder = 0;
		for (int i = 0; i < arrayDiscount.length; i++) {
			double discounted = calculateDiscountAmount(arrayDiscount[i].getPrice());
			discountAdder += discounted;
		}
		return discountAdder;
	}

	public static String checksHigherDiscount(Product[] higherDiscountArray) {
		double biggestDiscount = 0;
		String discountName = "";
		if(higherDiscountArray.length == 0) {
			return "";
		} else {
			for(int i = 0; i < higherDiscountArray.length; i++) {
				if(calculateDiscountAmount(higherDiscountArray[i].getPrice()) > biggestDiscount) {
					biggestDiscount = calculateDiscountAmount(higherDiscountArray[i].getPrice());
					discountName = higherDiscountArray[i].getName();
				}
			}
			return discountName;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many products do you want to buy??");
		int quantity = Integer.parseInt(sc.nextLine());
		Product[] product = new Product[quantity];
		for (int k = 0; k < quantity; k++) {
			Product p = new Product();
			System.out.println("What product name??");
			p.setName(sc.nextLine());
			System.out.println("What is the original price of the product??");
			p.setPrice(Double.parseDouble(sc.nextLine()));
			double discountedValue = calculateDiscountAmount(p.getPrice());
			System.out.printf("The amount payable for the product is $ %.2f\n", discountedValue);
			product[k] = p;
		}
		
		System.out.println("The highest discount product: " + checksHigherDiscount(product));
		System.out.println("The sum of the discounted values: " + String.format("$ %.2f", sumOfDiscount(product)));
		sc.close();
		
	}

}
