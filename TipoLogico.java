
public class TipoLogico {

	public static void main(String[] args) {
		boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		boolean variavelFalsa = false;
		System.out.println("Variavel falsa: " + variavelFalsa);
		
		System.out.println("---------------------------------");
		
		
		int idade = 18;
		
		boolean podeTirarCarteira = idade >= 18;
	
		// System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele pode tirar carteira");
		} else {
			System.out.println("Não pode tirar a carteira");
		}
		
	}

}
