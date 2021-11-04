package controle;

import java.util.Scanner;

public class DesafioNumeroPrimos04 {
	
	/*4. Criar um programa que receba um número e diga se ele é um número primo.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, contadorDeDivisores = 0;;
		
		System.out.println("Digite um numero: ");
		numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if(contadorDeDivisores == 0) {
			System.out.println("\nO número " + numero + " é primo.");
		}else {
			System.out.println("\nO número " + numero + " não é primo.");
		}
		
		entrada.close();
		
	}
}
