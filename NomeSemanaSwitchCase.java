import java.util.Scanner;

public class NomeSemanaSwitchCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE UM NUMERO DE 1 A 7, PARA RETORNARMOS UM DIA DA SEMANA");
		int numDia = sc.nextInt();

		String diaSemana = "Domingo";

		switch (numDia) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda-feira";
			break;
		case 3:
			diaSemana = "Terça-feira";
			break;
		case 4:
			diaSemana = "Quarta-feira";
			break;
		case 5:
			diaSemana = "Quinta-feira";
			break;
		case 6:
			diaSemana = "Sexta-feira";
			break;
		case 7:
			diaSemana = "Sabado";
			break;

		default:  System.out.println("DIA INVALIDO, DIGITE UM NUMERO DE 1 A 7 NOVAMENTE");
		System.exit(1);
			break;
		}
		System.out.println("Hoje é " + diaSemana);
		
		sc.close();
	}
}
