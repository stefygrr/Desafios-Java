package exercicios;

import java.util.Scanner;

public class Desafio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();
        
        System.out.println("Categoria do cliente:");
        System.out.println("1 - Comum");
        System.out.println("2 - Associado");
        System.out.println("3 - VIP");
        System.out.print("Escolha a categoria (1, 2, 3): ");
        int categoria = sc.nextInt();
        
        double valorFinal = valorCompra;
        if (categoria == 2) {
            valorFinal = valorCompra * 0.90; 
        } else if (categoria == 3) {
            valorFinal = valorCompra * 0.80; 
        }
        
        System.out.printf("O valor final da compra é: R$ %.2f%n", valorFinal);
        
        sc.close();
	}

}
