import java.util.Scanner;

public class VerificConcurcusoPublic {

	public static void main(String[] args) {
		
/** *Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
Ser�o dois par�metros para receber um para receber a nota de portugu�s e outro para receber as de matem�tica.
A prova, no total, vale 200 pontos - 100 para cada mat�ria. A nota m�nima total para passar � igual ou maior que 150. 
Entretanto, o candidato n�o pode tirar menos do que 60 pontos em qualquer uma das duas mat�rias, ou seja, se tirar 59 em
 portugu�s e 100 em matem�tica (totalizando uma nota maior do que o total necess�rio que � 150) ele n�o conseguir� a vaga.
No final mostre para o candidato se ele conseguiu ou n�o. ***/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BEM VINDO! ");
		System.out.println("VAMOS VERIFICAR SE VOC� PASSOU NO CONCURSO PUBLICO");
		
		System.out.print("DIGITE AQUI A SUA NOTA DE PORTUGUES: ");
		int notaPortugues = sc.nextInt();
		
		System.out.print("DIGITE AQUI A SUA NOTA DE MATEMATICA: ");
		int notaMatematica = sc.nextInt();
		
		int notaFinal = notaPortugues + notaMatematica;
		
		boolean aprovado = (notaPortugues >= 60) && (notaMatematica >= 60) && (notaFinal >= 150);
		
		if (aprovado ) {
			System.out.println("PARABENS! VOC� FOI APROVADO NO CONCURSO PUBLICO");
		} 
		else {
			System.out.println("SENTIMOS MUITO, MAS VOC� N�O FOI APROVADO EM NOSSO CONCURSO");
		}
		
sc.close();
	}

}
