package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.println("Bom");
		System.out.println("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("Nome: %s%n", "joão");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite a sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		entrada.close();
	}

}
