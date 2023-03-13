package segundaLista;

import java.util.Scanner;

public class exercício {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá seja bem-vindo(a) ao sistema de orndenação de números em ordem crescente!");
		
		System.out.println("Por favor digite o primeiro número inteiro!");
		int numero1 = scanner.nextInt();
		
		System.out.println("Por favor digite o segundo número inteiro!");
		int numero2 = scanner.nextInt();
		
		System.out.println("Por favor digite o terceiro número inteiro!");
		int numero3 = scanner.nextInt();
		
		if (numero1 < numero2 && numero1 < numero3) {
            if (numero2 < numero3) {
                System.out.println("Ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
            } else {
                System.out.println("Ordem crescente: " + numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            if (numero1 < numero3) {
                System.out.println("Ordem crescente: " + numero2 + ", " + numero1 + ", " + numero3);
            } else {
                System.out.println("Ordem crescente: " + numero2 + ", " + numero3 + ", " + numero1);
            }
        } else {
            if (numero1 < numero2) {
                System.out.println("Ordem crescente: " + numero3 + ", " + numero1 + ", " + numero2);
            } else {
                System.out.println("Ordem crescente: " + numero3 + ", " + numero2 + ", " + numero1);
            }
        }

	}

}
