package exercicios;

import java.util.Scanner;

public class Desafio04 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite o comprimento do primeiro lado:");
	        double lado1 = sc.nextDouble();

	        System.out.println("Digite o comprimento do segundo lado:");
	        double lado2 = sc.nextDouble();

	        System.out.println("Digite o comprimento do terceiro lado:");
	        double lado3 = sc.nextDouble();

	        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
	            System.out.println("Os lados fornecidos formam um triângulo válido.");
	        } else {
	            System.out.println("Os lados fornecidos NÃO formam um triângulo válido.");
	        }
		
		sc.close();
	}
	
}
