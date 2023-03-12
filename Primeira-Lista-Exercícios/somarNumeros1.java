package exercicioJava;

import java.util.Scanner;

public class somarNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite dois numeros, para obter sua soma");
		
		System.out.println("Digite o primeiro número: ");
		int numb1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numb2 = scanner.nextInt();
		
		int resultado = numb1 + numb2;
		System.out.print("A soma dos números, " + numb1 + " + " + numb2 + " é igual a: " + resultado);
		
	}
		
		
	

}
