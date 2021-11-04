package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		int somaMult = (3 + 2) * 6;
		int potencia1 = (int) Math.pow(somaMult,2);
		int mult1 = 3 * 2;
		int conta1 = potencia1 / mult1;
		
		
		int contaDeCima2 = ((1 - 5) * (2 - 7) / 2);
		int conta2 = (int) Math.pow(contaDeCima2, 2);
		
		int subtracao = conta1 - conta2;
		int potencia2 = (int) Math.pow(subtracao, 3);
		
		int potencia3 = (int) Math.pow(10, 3);
		
		int resultado = potencia2 / potencia3;
		
		System.out.println("resultado: " + resultado);
	}
}
