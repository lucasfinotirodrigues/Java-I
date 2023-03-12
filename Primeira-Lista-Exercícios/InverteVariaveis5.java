package exercicioJava;

import java.util.Scanner;

public class InverteVariaveis {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite dois valores quaisquer que vamos inverter essess valores, passando do valor A para o valor B");
		
		System.out.println("Digite o valor A");
		int valor_a = scanner.nextInt();
		
		System.out.println("Digite o valor B");
		int valor_b = scanner.nextInt();
		
		
		// Troca de valores
		
		int valor_c = valor_a;
		valor_a = valor_b;
		valor_b = valor_c;
		
		System.out.println("Agora os valores de A e B são respectivamente: " + valor_a + " e " + valor_b);
		
		
	}
}
