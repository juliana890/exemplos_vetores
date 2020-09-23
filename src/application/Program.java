package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de registros: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double soma = 0.0;
		double media;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura " + (i + 1) + ": ");
			vect[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		media = soma / n;
		
		System.out.println("\nAverage heigth: " + media);
		
		sc.close();

	}

}
