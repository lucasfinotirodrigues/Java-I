package exercicioJava;

import java.util.Scanner;

public class reajusteSalario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo(a) ao sistema de cálculos de ajustes de salário");
		
		System.out.println("Por favor utilizando somente os números, digite o valor do sálario atual do funcionário");
		float salario = scanner.nextFloat();
		
		System.out.println("Por favor utilizando somente os números, digite o percentual do sálario do funcionário que será reajustado");
		float percentual = scanner.nextInt();
		
		float porcentagem = (percentual / 100);
		
		float novoSalario = (salario * porcentagem) + salario;
		
		System.out.println("O valor do novo salário foi calculado, o salário anterior com o valor de R$" + salario + ", acrescido pela porcentagem de " + percentual + "%, define que o novo valor do salário será de: R$" + novoSalario);
 		

	}

}
