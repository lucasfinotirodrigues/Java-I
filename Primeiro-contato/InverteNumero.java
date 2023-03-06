package exercicioJava;

import java.util.Scanner;

public class InverteNumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número de três algarismos, como por exemplo '329'!");
		int numb = scanner.nextInt();
		
		System.out.println(inverter(numb,0));
	}

	private static int inverter(int n, int total) {
		if(n == 	0)
			return total;
		else return inverter(n / 10, total * 10 + n % 10);
	}
}



