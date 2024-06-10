package exercicios;

import java.util.Scanner;

public class Desafio02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um número inteiro:");
		int numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("O número " + numero + " é positivo.");
		}
		else if (numero < 0){
			System.out.println("O número " + numero + " é negativo.");
		}
		else {
			System.out.println("O número é zero.");
		}
		
		sc.close();
	}
}
