package arrays;

import java.util.Arrays;

public class ExercicioForeach {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		
		//System.out.println(notasAlunoA[4]); ERRO!!!
		
		double calculoA = 0;
		for(double notasA: notasAlunoA) {
			calculoA += notasA;
		}
		System.out.print(calculoA / notasAlunoA.length);
		
		System.out.println();
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10}; 
	
		double calculoB = 0;
		for (double notasB: notasAlunoB) {
			calculoB += notasB; 
				
		}
		System.out.print(calculoB/notasAlunoB.length);
		
	}

}
