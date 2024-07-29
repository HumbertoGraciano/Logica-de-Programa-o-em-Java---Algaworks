import java.util.Scanner;

public class ExercicioBoolean {
	public static void main(String[] args) {

/***O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica para saber se a 
 nota do aluno é maior que 70. O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean.
Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir, no console, uma 
mensagem que vai dizer se o aluno passou ou não passou.	***/	
		
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
		
		System.out.println("Apos a soma de suas notas e verificarmos que sua media é: " + media);
		
		System.out.println("------------------------------------------------------------------------------");
		boolean anoLetivo = media >= 7;
		
		if(anoLetivo) {
			System.out.println("Parabens!, você passou de ano!");
		} else {
			System.out.println("Você foi reprovado!");
		}
		sc.close();
	}
}
