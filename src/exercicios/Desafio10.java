package exercicios;

import java.util.Scanner;

public class Desafio10 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Digite o primeiro número: ");
		        double num1 = sc.nextDouble();
		        
		        System.out.print("Digite o segundo número: ");
		        double num2 = sc.nextDouble();
		        
		        System.out.print("Digite a operação (+, -, *, /): ");
		        char operacao = sc.next().charAt(0);

		        double resultado = 0;
		        boolean operacaoValida = true;

		        switch (operacao) {
		            case '+':
		                resultado = num1 + num2;
		                break;
		            case '-':
		                resultado = num1 - num2;
		                break;
		            case '*':
		                resultado = num1 *= num2;
		                break;
		            case '/':
		                if (num2 != 0) {
		                    resultado = num1 / num2;
		                } else {
		                    System.out.println("Erro: Divisão por zero não é permitida.");
		                    operacaoValida = false;
		                }
		                break;
		            default:
		                System.out.println("Erro: Operação inválida.");
		                operacaoValida = false;
		                break;
		        }

		        if (operacaoValida) {
		            System.out.println("O resultado é: " + resultado);
		        }

		        sc.close();
		    }

	}


