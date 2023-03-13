package segundaLista;

import java.util.Scanner;

public class exerício1 {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número de 3 algarismos: ");
        int numero = input.nextInt();
        
        if ( numero >= 1000) {
            System.out.println("Número inválido.");
            return;
        }
        
        int algarismo1 = numero / 100;
        int algarismo2 = (numero / 10) % 10;
        int algarismo3 = numero % 10;
        
        if (algarismo1 < algarismo2 && algarismo2 < algarismo3) {
            System.out.println("O número é ascendente.");
        } else {
            System.out.println("O número não é ascendente.");
        }
	}

}
