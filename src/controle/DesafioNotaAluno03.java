package controle;

import java.util.Scanner;

public class DesafioNotaAluno03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		double n1, n2, media;
		System.out.println("Digite suas duas notas: ");
		n1 = entrada.nextDouble(); n2 = entrada.nextDouble();
		
		media = (n1 + n2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		}else if(media < 7 && media > 4) {
			System.out.println("Recuperação!");
		}else {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
		
	}
}
