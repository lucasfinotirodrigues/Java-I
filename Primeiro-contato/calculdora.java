package exercicioJava;

import java.util.Scanner;

public class calculdora {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double num1, num2, result;
	        char operator;
	        System.out.println("Por favor digite o primeiro número: ");
	        num1 = scanner.nextDouble();
	        System.out.println("Escolha a operação a ser utilizada (+, -, *, /): ");
	        operator = scanner.next().charAt(0);
	        System.out.println("Escolha o segundo número: ");
	        num2 = scanner.nextDouble();
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println(num1 + " + " + num2 + " = " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println(num1 + " - " + num2 + " = " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println(num1 + " * " + num2 + " = " + result);
	                break;
	            case '/':
	                if (num2 == 0) {
	                    System.out.println("Impossível fazer uma divisão por zero");
	                    break;
	             	                }
	                result = num1 / num2;
	                System.out.println(num1 + " / " + num2 + " = " + result);
	                break;
	            default:
	                System.out.println("Operador Inválido!");
	                break;
	        }
	        scanner.close();
	    }

}
