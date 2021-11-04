package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.ano = 2021;
		
		Data d2 = new Data(31, 12, 2020);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormata();
		d2.imprimirDataFormata();
		
	}

}
