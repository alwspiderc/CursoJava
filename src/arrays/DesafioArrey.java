package arrays;

import java.util.Scanner;

public class DesafioArrey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas notas você deseja informar? ");
		int quantidadeNotas = sc.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
	
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Digite a " + (i + 1) + "° nota: ");
			notas[i] = sc.nextDouble();
		}
		
		double total = 0;
		for(double notinhas: notas) {
			total += notinhas;
			
		}
		
		total = total/quantidadeNotas;
		System.out.println("A média das notas é: " + total);
		
		sc.close();
	}
}
