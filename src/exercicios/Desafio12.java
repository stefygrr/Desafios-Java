package exercicios;

import java.util.Scanner;

public class Desafio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
 
        if (numero > 100) {
            System.out.println("O número é maior que 100.");
        } else {
            int dobro = numero * 2;
            System.out.println("O número é menor ou igual a 100. O dobro do número é: " + dobro);
        }
        
        sc.close();
	}

}
