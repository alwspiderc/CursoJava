package controle;

import java.util.Scanner;

public class DesafioAdivinharNumero06 {
	
	/*6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
	 *Armazene um numero aleatório em uma variável. O Jogador tem 10 
	 *tentativas para adivinhar o número gerado. Ao final de cada tentativa, 
	 *imprima a quantidade de tentativas restantes, e imprima se o número 
	 *inserido é maior ou menor do que o número armazenado.*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, superNumero = 10;
		
		for (int tentativa = 1; tentativa <= 10; tentativa++) {
			System.out.println("\nDigite um múmero entre 0 - 100: ");
			numero = entrada.nextInt();
			
			if(numero >= 0 && numero <= 100) {
				if(numero == superNumero) {
					System.out.println("Você acertou o número!!!! :)");
					tentativa = 10;
				}else if(numero > superNumero) {
					System.out.println("Você errou o número mas o número informado por você é maior do que o número do enigma!!");
				}
				else {
					System.out.println("Você errou o número mas o número informado por você é menor do que o número do enigma!!");
				}
			}else {
				System.out.println("O número digitado não pertence ao intervalo!");
			}
			
			System.out.println("Tentativa: " + tentativa);
		}
		
		entrada.close();
	}
}
