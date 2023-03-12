package exercicioJava;

import java.util.Scanner;

public class converteTemperatura {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor digite a temperatura em Fahrenheit para convertermos em Celsius");
		float fahrenheit = scanner.nextFloat();
		
		float celsius = ((fahrenheit - 32)/9) * 5;
		
		System.out.println("A temperatura em Fahrenheit é de " + fahrenheit + "°F, convertendo para Celsius a temperatura será de " + celsius + " °C");
		
	}

}
