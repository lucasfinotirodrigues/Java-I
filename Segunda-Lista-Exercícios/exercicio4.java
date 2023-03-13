package segundaLista;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

		System.out.println("Olá seja bem-vindo(a) ao sistema de determinação dos triângulos. Digite os três lados de um triângulo, por favor");
		
	        
	        System.out.print("Digite o valor do primeiro lado do triângulo: ");
	        double lado1 = sc.nextDouble();
	        
	        System.out.print("Digite o valor do segundo lado do triângulo: ");
	        double lado2 = sc.nextDouble();
	        
	        System.out.print("Digite o valor do terceiro lado do triângulo: ");
	        double lado3 = sc.nextDouble();
	        
	        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
	            
	            if (lado1 == lado2 && lado2 == lado3) {
	                System.out.println("Triângulo equilátero.");
	            }

	            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	                System.out.println("Triângulo isósceles.");
	            }

	            else {
	                System.out.println("Triângulo escaleno.");
	            }
	        }

	        else {
	            System.out.println("Os valores informados não formam um triângulo.");
	        }
	        
	        sc.close();
	}
}
