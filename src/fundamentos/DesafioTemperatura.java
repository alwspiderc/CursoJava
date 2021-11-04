package fundamentos;

import java.util.Scanner;

public class DesafioTemperatura {
	
	/*Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite uma tempratura em celsius: ");
		double tempC = sc.nextInt();
		
		double tempFah = tempC * 9/5 + 32;
				
		System.out.println("A temperatura em celsius convertida para fahrenheit é: " + tempFah);		
				// (0 °C × 9/5) + 32 = 32 °F]
		
		sc.close();
	}
}
