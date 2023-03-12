package exercicioJava;

import java.util.Scanner;

public class metrosMilimetros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por gentileza, utilizando apenas os números digite um valor em metros para convertermos em milímetros");
		float metro = scanner.nextInt();
		
		float milimetro = (metro / 1000); 
		
		System.out.print("A conversão para milímetros do número digitado " + metro + " em metros é de: " + milimetro + " milímetros");
	}
	
	

}
