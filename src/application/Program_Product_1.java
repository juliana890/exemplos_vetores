package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_1;

public class Program_Product_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de registros: ");
		int n = sc.nextInt();
		double soma = 0.0, media;
		
		Product_1[] vect = new Product_1[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			
			System.out.print("Produto nome: ");
			String name = sc.nextLine();
			
			System.out.print("Produto preço: ");
			double price = sc.nextDouble();
			
			vect[i] = new Product_1(name, price);
		}
		
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		media = soma / vect.length;
		
		System.out.printf("%nAverage price: %.2f%n", media);
		
		sc.close();

	}

}
