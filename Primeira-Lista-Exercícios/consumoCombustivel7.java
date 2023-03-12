package exercicioJava;

import java.util.Scanner;

public class consumoCombustivel {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Seja bem-vindo(a) ao sistema de cálculo de desempenho e custo de viagens");
		
		System.out.println("Utilizando somente os números e a vírgula para separação decimal, digite o preço médio do litro do combustível");
		double combustivel = scanner.nextDouble();
		
		System.out.println("Utilizando somente os números e a vírgula para separação decimal, qual o desempenho do veículo? Ou seja a quantidade de Km que o mesmo faz com 1 litro de combustível?");
		double desempenho = scanner.nextDouble();
		
		System.out.println("Utilizando somente os números e a vírgula para separação decimal, qual a distância entre as cidades que você irá percorrer?");
		double distancia = scanner.nextDouble();
		
		double combustivelUtilizado = distancia/desempenho;
		
		double precoPagar = combustivelUtilizado * combustivel;
		
		System.out.println("Calculamos para você a quantidade de litros que você irá consumir e o resultado foi de " + combustivelUtilizado + " litros");
		
		System.out.println("Esse total de litros gastos, irão custar um total de R$" + precoPagar);
		
	}

}
