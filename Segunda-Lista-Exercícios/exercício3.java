package segundaLista;

import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);		
				
		System.out.println("Olá seja bem-vindo(a) ao sistema de cálculo de formas geométricas");
		
		System.out.println("Por favor digite 1 para calcular a área de um retângulo e 2 para calcular a área de um triângulo!");
		int op = scanner.nextInt();
		
		System.out.println("Por favor informe a base da forma geométrica");
		float base = scanner.nextFloat();		
		
		
		System.out.println("Por favor informe a altura da forma geométrica");
		float altura = scanner.nextFloat();		
		
		if(op == 1) {
			float triangulo = base * altura;
			System.out.println("A área da sua forma geométrica é: "+ triangulo);
		}
		
		if(op == 2) {
			float retangulo = (base * altura) / 2;
			System.out.println("A área da sua forma geométrica é: "+ retangulo);
		};
		
		
		
		
		

	}

}
