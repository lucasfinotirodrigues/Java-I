package exercicioJava;

import java.util.Scanner;
import java.util.Arrays;


public class ordernarNumeros {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Por favor digite os três números inteiros separados por espaço: ");
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();

	        int[] numbers = {a, b, c};
	        Arrays.sort(numbers);

	        System.out.println("Os números em ordem crescente são: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);

	        scanner.close();
	    }
	}


