import java.util.Scanner;

public class ExercicioBoolean {
	public static void main(String[] args) {

/***O seu programa deve receber a nota do aluno pelo console e depois voc� vai fazer uma opera��o l�gica para saber se a 
 nota do aluno � maior que 70. O resultado dessa opera��o l�gica deve ser atribuido a uma vari�vel do tipo Boolean.
Por �ltimo, voc� deve utilizar a vari�vel do tipo Boolean com a estrutura de decis�o if para imprimir, no console, uma 
mensagem que vai dizer se o aluno passou ou n�o passou.	***/	
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("BEM VINDO, ALUNO! Hora de descobrirmos sua media e o seu resultado final do ano letivo" );
		System.out.println("Digite sua nota da prova de Matematica: ");
		int notaMat = sc.nextInt();
		
		System.out.println("Digite sua nota da prova de Portugues: ");
		int notaPort = sc.nextInt();
		
		System.out.println("Digite sua nota da prova de Geografia: ");
		int notaGeo = sc.nextInt();
		
		System.out.println("Digite sua nota da prova de Biologia: ");
		int notaBio = sc.nextInt();
		
		System.out.println("Digite sua nota da prova de Historia: ");
		int notaHist = sc.nextInt();
		
		System.out.println("Digite sua nota da prova de Fisica: ");
		int notaFis = sc.nextInt();
		
		System.out.println("Digite sua nota da prova de Sociologia: ");
		int notaSoc = sc.nextInt();
		
		System.out.println("Digite sua nota da prova de Ed. Fisica: ");
		int notaEduca = sc.nextInt();
		
		int soma = notaBio + notaEduca + notaFis + notaGeo + notaHist + notaMat + notaPort + notaSoc;
		int media = soma /8;
		
		System.out.println("Apos a soma de suas notas e verificarmos que sua media �: " + media);
		
		System.out.println("------------------------------------------------------------------------------");
		boolean anoLetivo = media >= 7;
		
		if(anoLetivo) {
			System.out.println("Parabens!, voc� passou de ano!");
		} else {
			System.out.println("Voc� foi reprovado!");
		}
		sc.close();
	}
}
