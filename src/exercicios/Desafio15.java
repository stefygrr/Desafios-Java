package exercicios;

import java.util.Scanner;

public class Desafio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso em kg: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);
        System.out.print("Categoria: ");

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc < 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }

        sc.close();
	}

}
