package exercicioJava;

import java.util.Scanner;

public class calculoemSegundos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por gentileza, digite a quantidade de dias, horas, minutos e segundos que mostraremos esse total em segundos");
		
		System.out.println("Digite a quantidade de dias");
		int dias = scanner.nextInt();
		
		System.out.println("Digite a quantidade de horas");
		int horas = scanner.nextInt();
				
		System.out.println("Digite a quantidade de minutos");
		int minutos = scanner.nextInt();
		
		System.out.println("Digite a quantidade de segundos");
		int segundos = scanner.nextInt();
				
			
		int resultado  = ((dias * 24) * 3600) + ((horas * 3600) + (minutos * 60) + segundos);
		
		System.out.println("Fizemos o cálculo em segundos dos valores inseridos por você, esse foi o resultado em segundos: " + resultado);
	}

}
