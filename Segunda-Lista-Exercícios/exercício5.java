package segundaLista;

import java.util.Scanner;

public class exercício5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Olá seja bem-vindo(a) ao sistema de determinação de tipos de triângulos!");		
        
        System.out.print("Digite o valor do ângulo 1: ");
        double angulo1 = sc.nextDouble();
        
        System.out.print("Digite o valor do ângulo 2: ");
        double angulo2 = sc.nextDouble();
        
        System.out.print("Digite o valor do ângulo 3: ");
        double angulo3 = sc.nextDouble();
        
       
        if (angulo1 + angulo2 + angulo3 == 180) {
            
      
            if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                System.out.println("Triângulo retângulo.");
            }
           
            else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
                System.out.println("Triângulo obtusângulo.");
            }
            
            else {
                System.out.println("Triângulo acutângulo.");
            }
        }
        
        else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
        
        sc.close();

	}

}
