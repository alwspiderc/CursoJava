package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		String salario1, salario2, salario3;
		
		System.out.println("Digite seus três ultimos salários:");
		salario1 = ent.nextLine().replace(",", "."); 
		salario2 = ent.nextLine().replace(",", "."); 
		salario3 = ent.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.println("Média dos três últimos salários: " + media);
		
		ent.close();
	}
}
