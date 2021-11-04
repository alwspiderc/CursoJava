package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double num1, num2;
		String operacao;
		
		System.out.println("Digite os dois número que deseja fazer a operação: ");
		num1 = sc.nextDouble(); num2 = sc.nextDouble();
		
		System.out.println("Qual operação deseja realizar: +, -, *, /, %");
		operacao = sc.next();
		
		//Lógica
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;		 
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;		 
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;		 
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		sc.close();
	}
}
