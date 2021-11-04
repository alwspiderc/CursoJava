package controle;

import java.util.Scanner;

public class DesafioAnoBissexto02 {
	/*2. Criar um programa informa se o ano atual é um ano bissexto;*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = entrada.nextInt();

		int bissexto = anoAtual % 4;

		if (bissexto == 0) {
			System.out.println(anoAtual + " é um ano bissexto");
		} else {
			System.out.println(anoAtual + " não é um ano bissexto");
		}
		 
		entrada.close();
	}
}
