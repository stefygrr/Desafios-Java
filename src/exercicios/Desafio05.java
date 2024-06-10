package exercicios;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3.0;
		
		if (media >= 7.0) {
            System.out.println("Aluno aprovado com média: " + media);
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Aluno em recuperação com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
		
		sc.close();
	}

}
