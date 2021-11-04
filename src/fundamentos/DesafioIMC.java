package fundamentos;

import java.util.Scanner;

public class DesafioIMC {
	
	/*Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();
		
		double IMC = peso / (Math.pow(altura, 2));
		
		System.out.printf("Seu IMC é %.2f", IMC);
		
		sc.close();
	}
}
