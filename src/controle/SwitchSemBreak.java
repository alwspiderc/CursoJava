package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String feixa = "marrom";
		
		switch(feixa.toLowerCase()) {
		case "preto":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxo":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarala":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("Fim!");
		System.out.println("\n\n");
		int idade = 3;
		
		switch(idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1: 
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
	}
}
