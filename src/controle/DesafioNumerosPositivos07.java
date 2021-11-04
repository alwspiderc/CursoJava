package controle;

import java.util.Scanner;

public class DesafioNumerosPositivos07 {
	
	/*7. Criar um programa que enquanto estiver recebendo n�meros positivos, 
	 *imprime no console a soma dos n�meros inseridos, caso receba um n�mero 
	 *negativo, encerre o programa. Tente utilizar a estrutura do while.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numerosPositivos = 0, soma = 0;
		
		while (numerosPositivos >= 0) {
			System.out.println("Digite um n�mero inteiro positivo: ");
			numerosPositivos = entrada.nextInt();
			
			soma += numerosPositivos;
			System.out.println("Soma: " + soma);
			
		}
		
		entrada.close();
	}
}
