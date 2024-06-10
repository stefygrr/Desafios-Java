package exercicios;

import java.util.Scanner;

public class Desafio07 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.println("Digite a idade da pessoa: ");
    int idade = sc.nextInt();

    if (idade >= 0 && idade <= 12) {
        System.out.println("Criança");
    } else if (idade >= 13 && idade <= 17) {
        System.out.println("Adolescente");
    } else if (idade >= 18 && idade <= 59) {
        System.out.println("Adulto");
    } else if (idade >= 60) {
        System.out.println("Idoso");
    } else {
        System.out.println("Idade inválida");
    }

    sc.close();
	}
}

