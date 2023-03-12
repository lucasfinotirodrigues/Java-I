package exercicioJava;

import java.util.Scanner;

public class mediaNumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite três numeros, para obter sua soma");
		
		System.out.println("Digite o primeiro número: ");
		int numb1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numb2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int numb3 = scanner.nextInt();
		
		int resultado = (numb1 + numb2 + numb3) / 3;
		System.out.print("A média dos números digitados é: " + resultado);
		
		
		
	}

}
