import java.util.Scanner;

public class VerificPossibAposentadoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE AQUI, QUAL A SUA IDADE? ");
		int idade = sc.nextInt();
		
		System.out.print("QUANTOS ANOS DE CONTRIBUI��O VOC� TEM? ");
		int tempoContribuicao = sc.nextInt();
		
		boolean aposentadoriaAprovada = (idade >= 55) && (tempoContribuicao >= 25);
		
		if (aposentadoriaAprovada) {
			System.out.println("VOC� TEM O DIREITO DE SE APOSENTAR");
		} 
		else {
			System.out.println("VOC� N�O PODE SE APOSENTAR");
		}
		sc.close();
	}

}
