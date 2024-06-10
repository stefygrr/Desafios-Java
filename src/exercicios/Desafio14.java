package exercicios;

import java.util.Scanner;

public class Desafio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        if (numero > 0) {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("O número é positivo.");
            System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada);
        } else if (numero < 0) {
            double aoQuadrado = Math.pow(numero, 2);
            System.out.println("O número é negativo.");
            System.out.println(numero + " ao quadrado é " + aoQuadrado);
        } else {
            System.out.println("O número é zero.");
        }

        sc.close();
	}

}
