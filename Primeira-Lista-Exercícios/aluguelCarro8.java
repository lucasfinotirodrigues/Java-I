package exercicioJava;

import java.util.Scanner;

public class aluguelCarro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sabedo que o alugel de um veículo tem o custo por dia e por Km rodado, precisamos saber quantos dias você está com o veículo");
		
		System.out.println("Quantos dias você está com o veículo?");
		int dias = scanner.nextInt();
		
		System.out.println("Quantos Km foram rodados no total desses dias");
		double quilometros = scanner.nextInt();
		
		double calculoQuilometro = quilometros * 0.15;
		
		double calculoDias = dias * 60;
		
		double total = calculoDias + calculoQuilometro;
		
		System.out.println("Calculamos o total que foi gasto de acordo com os valores inseridos");
		System.out.print("R$" + calculoQuilometro + "referentes aos Km rodados," + "R$" + calculoDias + "referentes aos dias utilizados" + ", totalizando o valor de R$" + total);
		
		}

}
