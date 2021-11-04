package controle;

import java.util.Scanner;

public class DesafioVerificarNumeroPar01 {
	
	/*1. Criar um programa que receba um número 
	 *e verifique se ele está entre 0 e 10 e é par;*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número entre 0 e 10: ");
		numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("Número par entre 0 e 10 :)");
			}else {
				System.out.println("Número não é par e está entre 0 e 10 :)");
			}
		}else {
			System.out.println("Número não está entre 0 e 10");
		}
		
		entrada.close();
	}
}
