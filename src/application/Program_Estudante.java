package application;

import java.util.Scanner;

import entities.Quarto_Estudante;

public class Program_Estudante {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qtdeQuartos;
		
		System.out.print("How many rooms will be rented? ");
		qtdeQuartos = sc.nextInt();
		
		Quarto_Estudante[] qe = new Quarto_Estudante[10];
		
		for(int i = 1; i <= qtdeQuartos; i++) {
			System.out.print("Rent #" + i + ":");
			sc.nextLine();
			System.out.print("\nName: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			qe[room] = new Quarto_Estudante(nome, email);
			
		}
		
		System.out.println("\nBusy Rooms:");
		
		for(int i = 0; i < 10; i++) {
			if(qe[i] != null) {
				System.out.println(i + ": " + qe[i]);
			}
		}
		
		sc.close();
		

	}

}
