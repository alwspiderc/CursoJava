package execao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{
	final String nomeDoAtributo;
	
	 public StringVaziaException(String nomeDoAtributo) {
		 this.nomeDoAtributo = nomeDoAtributo;
	 }
	 
	 public String getMessage() {
		 return String.format("O atributo '%s' esta vazio", nomeDoAtributo);
	}
}
