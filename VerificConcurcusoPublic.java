import java.util.Scanner;

public class VerificConcurcusoPublic {

	public static void main(String[] args) {
		
/** *Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. 
Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em
 português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
No final mostre para o candidato se ele conseguiu ou não. ***/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BEM VINDO! ");
		System.out.println("VAMOS VERIFICAR SE VOCÊ PASSOU NO CONCURSO PUBLICO");
		
		System.out.print("DIGITE AQUI A SUA NOTA DE PORTUGUES: ");
		int notaPortugues = sc.nextInt();
		
		System.out.print("DIGITE AQUI A SUA NOTA DE MATEMATICA: ");
		int notaMatematica = sc.nextInt();
		
		int notaFinal = notaPortugues + notaMatematica;
		
		boolean aprovado = (notaPortugues >= 60) && (notaMatematica >= 60) && (notaFinal >= 150);
		
		if (aprovado ) {
			System.out.println("PARABENS! VOCÊ FOI APROVADO NO CONCURSO PUBLICO");
		} 
		else {
			System.out.println("SENTIMOS MUITO, MAS VOCÊ NÃO FOI APROVADO EM NOSSO CONCURSO");
		}
		
sc.close();
	}

}
