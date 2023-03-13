package segundaLista;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá seja bem-vindo(a) ao sistema de informação sobre o rodízio de placas de São Paulo!");
		System.out.println("Por favor digite os números da placa do seu veículo");
		int placa = scanner.nextInt();
		
		
		int algarismo = placa % 10;
		if(algarismo == 1 || algarismo == 2) {
			System.out.println("Seu Carro tem placa com o final" + algarismo +  ", entao ele não pode rodar na cidade de São Paulo na segunda-feira");
		}
		if(algarismo == 3 || algarismo == 4) {
			System.out.println("Seu Carro tem placa com o final" + algarismo +  ", entao ele não pode rodar na cidade de São Paulo na terça-feira");
		}
		if(algarismo == 5 || algarismo == 6) {
			System.out.println("Seu Carro tem placa com o final" + algarismo +  ", entao ele não pode rodar na cidade de São Paulo na quarta-feira");
		}
		if(algarismo == 7 || algarismo == 8) {
			System.out.println("Seu Carro tem placa com o final" + algarismo +  ", entao ele não pode rodar na cidade de São Paulo na quinta-feira");
		}
		if(algarismo == 9 || algarismo == 0) {
			System.out.println("Seu Carro tem placa com o final" + algarismo +  ", entao ele não pode rodar na cidade de São Paulo na sexta-feira");
		}
		
		System.out.println(algarismo);
	}

}
