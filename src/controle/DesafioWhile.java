package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("MÉDIA DAS NOTAS DE UMA TURMA...\n");
		
		int qualtidadeDeNotas = 0;
		double nota = 0, total = 0;
		
		
		while (nota != -1) {
			System.out.println("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				qualtidadeDeNotas++;
			}else if(nota != -1) {
				System.out.println("Nota inválida!!!");
			}
			
		}
		
		// calcula a média
		double media = total/qualtidadeDeNotas;
		System.out.println("Média = " + media);
		
		entrada.close();
	}
}
